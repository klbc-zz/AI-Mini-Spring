package org.klframework.beans.factory.support;

import org.klframework.beans.BeansException;
import org.klframework.beans.factory.config.BeanDefinition;

/**
 * Bean的实例化策略
 *
 * 现在bean是在AbstractAutowireCapableBeanFactory.doCreateBean方法中
 * 用beanClass.newInstance()来实例化，仅适用于bean有无参构造函数的情况。
 *
 * 针对bean的实例化，抽象出一个实例化策略的接口InstantiationStrategy，有两个实现类：
 *
 * - SimpleInstantiationStrategy，使用bean的构造函数来实例化
 * - CglibSubclassingInstantiationStrategy，使用CGLIB动态生成子类
 *
 * @author 刘康炼
 * @date 2023/8/29
 * @time 14:23
 * @Description 
 */
public interface InstantiationStrategy {

	Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
