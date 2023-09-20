package org.klframework.beans.factory.config;


import org.klframework.beans.factory.HierarchicalBeanFactory;


public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    /**
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);
}