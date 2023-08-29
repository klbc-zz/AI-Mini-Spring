package org.klframework.beans;


/**
 * bean异常类
 *
 * @author 刘康炼
 * @date 2023/8/29
 * @time 11:45
 * @Description 
 */
public class BeansException extends RuntimeException {

	public BeansException(String msg) {
		super(msg);
	}

	public BeansException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
