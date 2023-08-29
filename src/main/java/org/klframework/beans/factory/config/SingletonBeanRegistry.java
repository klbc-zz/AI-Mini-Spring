package org.klframework.beans.factory.config;

/**
 * 单例注册表
 *SingletonBeanRegistry及其实现类DefaultSingletonBeanRegistry，定义添加和获取单例bean的方法。
 * @author 刘康炼
 * @date 2023/8/29
 * @time 13:55
 * @Description
 */
public interface SingletonBeanRegistry {

	Object getSingleton(String beanName);
}
