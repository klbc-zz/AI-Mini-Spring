package org.klframework.beans.factory;

public interface InitializingBean {

	void afterPropertiesSet() throws Exception;
}
