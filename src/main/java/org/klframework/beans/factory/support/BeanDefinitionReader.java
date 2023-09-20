package org.klframework.beans.factory.support;

import org.klframework.beans.BeansException;
import org.klframework.core.io.Resource;
import org.klframework.core.io.ResourceLoader;

/**
 * 读取bean定义信息即BeanDefinition的接口
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 17:03
 * @Description 
 */
public interface BeanDefinitionReader {

	BeanDefinitionRegistry getRegistry();

	ResourceLoader getResourceLoader();

	void loadBeanDefinitions(Resource resource) throws BeansException;

	void loadBeanDefinitions(String location) throws BeansException;

	void loadBeanDefinitions(String[] locations) throws BeansException;
}
