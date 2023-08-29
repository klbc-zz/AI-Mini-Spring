package org.klframework.beans.factory.support;


import org.klframework.beans.factory.config.BeanDefinition;

/**
 *
 *
 * @author 刘康炼
 * @date 2023/8/29
 * @time 11:50
 * @Description BeanDefinition注册表接口
 */
public interface BeanDefinitionRegistry {

	/**
	 * 向注册表中注BeanDefinition
	 *
	 * @param beanName
	 * @param beanDefinition
	 */
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
