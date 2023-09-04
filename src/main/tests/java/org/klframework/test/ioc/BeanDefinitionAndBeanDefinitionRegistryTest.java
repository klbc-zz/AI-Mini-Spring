package org.klframework.test.ioc;


import org.junit.Test;
import org.klframework.beans.factory.config.BeanDefinition;
import org.klframework.beans.factory.support.DefaultListableBeanFactory;
import org.klframework.test.ioc.service.HelloService;

public class BeanDefinitionAndBeanDefinitionRegistryTest {

	@Test
	public void testBeanFactory() throws Exception {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		BeanDefinition beanDefinition = new BeanDefinition(HelloService.class);
		beanFactory.registerBeanDefinition("helloService", beanDefinition);

		HelloService helloService = (HelloService) beanFactory.getBean("helloService");
		helloService.sayHello();
	}
}
