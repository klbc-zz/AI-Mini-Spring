package org.klframework.beans.factory;

import org.klframework.beans.BeansException;

/**
 * bean容器
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 11:43
 * @Description 
 */
public interface BeanFactory {

	/**
	 * 获取bean
	 *
	 * @param name
	 * @return
	 * @throws BeansException bean不存在时
	 */
	Object getBean(String name) throws BeansException;
}