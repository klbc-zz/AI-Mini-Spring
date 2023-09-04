package org.klframework.beans.factory.support;


import org.klframework.beans.BeansException;
import org.klframework.beans.factory.ConfigurableListableBeanFactory;
import org.klframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 默认创建bean
 * bean容器作为BeanDefinitionRegistry和SingletonBeanRegistry的实现类，具备两者的能力。向bean容器中注册BeanDefintion后，使用bean时才会实例化。
 * @author 刘康炼
 * @date 2023/8/29
 * @time 14:10
 * @Description 
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements ConfigurableListableBeanFactory, BeanDefinitionRegistry {

	private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

	@Override
	public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
		beanDefinitionMap.put(beanName, beanDefinition);
	}



	@Override
	public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
		BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
		if (beanDefinition == null) {
			throw new BeansException("No bean named '" + beanName + "' is defined");
		}

		return beanDefinition;
	}

	@Override
	public boolean containsBeanDefinition(String beanName) {
		return beanDefinitionMap.containsKey(beanName);
	}

	@Override
	public <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException {
		Map<String, T> result = new HashMap<>();
		beanDefinitionMap.forEach((beanName, beanDefinition) -> {
			Class beanClass = beanDefinition.getBeanClass();
			if (type.isAssignableFrom(beanClass)) {
				T bean = (T) getBean(beanName);
				result.put(beanName, bean);
			}
		});
		return result;
	}

	@Override
	public String[] getBeanDefinitionNames() {
		Set<String> beanNames = beanDefinitionMap.keySet();
		return beanNames.toArray(new String[beanNames.size()]);
	}

	@Override
	public void preInstantiateSingletons() throws BeansException {
		beanDefinitionMap.keySet().forEach(this::getBean);
	}
}