package org.klframework.test.ioc;

import org.junit.Test;
import org.klframework.beans.factory.support.DefaultListableBeanFactory;
import org.klframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.klframework.test.ioc.bean.Car;
import org.klframework.test.ioc.bean.Person;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class XmlFileDefineBeanTest {

	@Test
	public void testXmlFile() throws Exception {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		beanDefinitionReader.loadBeanDefinitions("classpath:spring.xml");

		Person person = (Person) beanFactory.getBean("person");
		System.out.println(person);
		assertThat(person.getName()).isEqualTo("derek");
		assertThat(person.getCar().getBrand()).isEqualTo("porsche");

		Car car = (Car) beanFactory.getBean("car");
		System.out.println(car);
		assertThat(car.getBrand()).isEqualTo("porsche");
	}
}
