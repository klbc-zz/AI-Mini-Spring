package org.klframework.beans.factory.config;

import org.klframework.beans.PropertyValues;

/**
 * BeanDefinition实例保存bean的信息，包括class类型、方法构造参数、是否为单例等，此处简化只包含class类型和bean属性
 *
 * BeanDefinition，顾名思义，用于定义bean信息的类，包含bean的class类型、构造参数、属性值等信息，
 * 每个bean对应一个BeanDefinition的实例。简化BeanDefition仅包含bean的class类型。
 * @author 刘康炼
 * @date 2023/8/29
 * @time 11:50
 * @Description 
 */
public class BeanDefinition {

	private Class beanClass;

	private PropertyValues propertyValues;
	private String initMethodName;



	private String destroyMethodName;

	public BeanDefinition(Class beanClass) {
		this(beanClass, null);
	}
	public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
		this.beanClass = beanClass;
		this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
	}

	public Class getBeanClass() {
		return beanClass;
	}

	public void setBeanClass(Class beanClass) {
		this.beanClass = beanClass;
	}

	public PropertyValues getPropertyValues() {
		return propertyValues;
	}

	public void setPropertyValues(PropertyValues propertyValues) {
		this.propertyValues = propertyValues;
	}
	public String getInitMethodName() {
		return initMethodName;
	}

	public void setInitMethodName(String initMethodName) {
		this.initMethodName = initMethodName;
	}

	public String getDestroyMethodName() {
		return destroyMethodName;
	}

	public void setDestroyMethodName(String destroyMethodName) {
		this.destroyMethodName = destroyMethodName;
	}
}