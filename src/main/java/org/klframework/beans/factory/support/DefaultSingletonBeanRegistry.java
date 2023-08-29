package org.klframework.beans.factory.support;


import org.klframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;
/**
 * 默认单例注册表
 *
 * @author 刘康炼
 * @date 2023/8/29
 * @time 13:55
 * @Description
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

	//通过map保存单例模型的，雀食
	private Map<String, Object> singletonObjects = new HashMap<>();

	@Override
	public Object getSingleton(String beanName) {
		return singletonObjects.get(beanName);
	}

	protected void addSingleton(String beanName, Object singletonObject) {
		singletonObjects.put(beanName, singletonObject);
	}
}