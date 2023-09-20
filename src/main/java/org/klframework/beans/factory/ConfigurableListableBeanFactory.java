package org.klframework.beans.factory;

import org.klframework.beans.BeansException;
import org.klframework.beans.factory.config.AutowireCapableBeanFactory;
import org.klframework.beans.factory.config.BeanDefinition;
import org.klframework.beans.factory.config.BeanPostProcessor;
import org.klframework.beans.factory.config.ConfigurableBeanFactory;
/**
 * 可配置列表Bean工厂
 * 
 * @author 刘康炼
 * @date 2023/9/20
 * @time 15:45
 * @Description 
 */

public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

	/**
	 * 根据名称查找BeanDefinition
	 *
	 * @param beanName
	 * @return
	 * @throws BeansException 如果找不到BeanDefintion
	 */
	BeanDefinition getBeanDefinition(String beanName) throws BeansException;


	/**
	 * 提前实例化所有单例实例
	 *
	 * @throws BeansException
	 */
	void preInstantiateSingletons() throws BeansException;

	void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

}
