package org.klframework.beans.factory.support;


import org.klframework.beans.BeansException;
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

	/**
	 * 根据名称查找BeanDefinition
	 *
	 * @param beanName
	 * @return
	 * @throws BeansException 如果找不到BeanDefintion
	 */
	BeanDefinition getBeanDefinition(String beanName) throws BeansException;

	/**
	 * 是否包含指定名称的BeanDefinition
	 *
	 * @param beanName
	 * @return
	 */
	boolean containsBeanDefinition(String beanName);

	/**
	 * 返回定义的所有bean的名称
	 *
	 * @return
	 */
	String[] getBeanDefinitionNames();
}
