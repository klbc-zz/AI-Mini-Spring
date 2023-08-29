package org.klframework.beans.factory.support;

import org.klframework.beans.BeansException;
import org.klframework.beans.factory.BeanFactory;
import org.klframework.beans.factory.config.BeanDefinition;

/**
 * 抽象bean工厂
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 14:00
 * @Description 
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

	@Override
	public Object getBean(String name) throws BeansException {
		Object bean = getSingleton(name);
		if (bean != null) {
			return bean;
		}

		BeanDefinition beanDefinition = getBeanDefinition(name);
		return createBean(name, beanDefinition);
	}

	protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

	protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;
}
