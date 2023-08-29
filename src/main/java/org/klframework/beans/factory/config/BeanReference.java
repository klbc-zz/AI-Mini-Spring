package org.klframework.beans.factory.config;

/**
 *  一个bean对另一个bean的引用
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 15:39
 * @Description 
 */
public class BeanReference {

	private final String beanName;


	public BeanReference(String beanName) {
		this.beanName = beanName;
	}

	public String getBeanName() {
		return beanName;
	}
}
