package org.klframework.beans.factory.config;

/**
 * BeanFactoryPostProcessor是spring提供的容器扩展机制，
 * 允许我们在bean实例化之前修改bean的定义信息即BeanDefinition的信息。
 * 其重要的实现类有PropertyPlaceholderConfigurer和CustomEditorConfigurer，
 * PropertyPlaceholderConfigurer的作用是用properties文件的配置值替换xml文件中的占位符，
 * CustomEditorConfigurer的作用是实现类型转换。
 */

import org.klframework.beans.BeansException;
import org.klframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * 允许自定义修改BeanDefinition的属性值
 * 
 * @author 刘康炼
 * @date 2023/8/30
 * @time 14:18
 * @Description 
 */
public interface BeanFactoryPostProcessor {

	/**
	 * 在所有BeanDefintion加载完成后，但在bean实例化之前，提供修改BeanDefinition属性值的机制
	 *
	 * @param beanFactory
	 * @throws BeansException
	 */
	void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}