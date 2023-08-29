package org.klframework.beans.factory.support;

import org.klframework.beans.BeansException;
import org.klframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 14:26
 * @Description 
 */
public class SimpleInstantiationStrategy implements InstantiationStrategy {

	/**
	 * 简单的bean实例化策略，根据bean的无参构造函数实例化对象
	 *
	 * @param beanDefinition
	 * @return
	 * @throws BeansException
	 */
	@Override
	public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
		Class beanClass = beanDefinition.getBeanClass();
		try {
			Constructor constructor = beanClass.getDeclaredConstructor();
			return constructor.newInstance();
		} catch (Exception e) {
			throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
		}
	}
}