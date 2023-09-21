package org.klframework.test.ioc.common;

import org.klframework.beans.BeansException;
import org.klframework.beans.PropertyValue;
import org.klframework.beans.PropertyValues;
import org.klframework.beans.factory.ConfigurableListableBeanFactory;
import org.klframework.beans.factory.config.BeanDefinition;
import org.klframework.beans.factory.config.BeanFactoryPostProcessor;

public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("CustomBeanFactoryPostProcessor#postProcessBeanFactory");
		BeanDefinition personBeanDefiniton = beanFactory.getBeanDefinition("person");
		PropertyValues propertyValues = personBeanDefiniton.getPropertyValues();
		//将person的name属性改为ivy
		propertyValues.addPropertyValue(new PropertyValue("name", "ivy"));
	}
}