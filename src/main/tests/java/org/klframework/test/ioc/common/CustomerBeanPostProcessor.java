package org.klframework.test.ioc.common;

import org.klframework.beans.BeansException;
import org.klframework.beans.factory.config.BeanPostProcessor;
import org.klframework.test.ioc.bean.Car;

public class CustomerBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("CustomerBeanPostProcessor#postProcessBeforeInitialization");
		//换兰博基尼
		if ("car".equals(beanName)) {
			((Car) bean).setBrand("lamborghini");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("CustomerBeanPostProcessor#postProcessAfterInitialization");
		if ("car".equals(beanName)) {
			((Car) bean).setBrand("lamborghini");
		}
		return bean;
	}
}