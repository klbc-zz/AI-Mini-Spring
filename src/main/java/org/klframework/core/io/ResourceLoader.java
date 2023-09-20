package org.klframework.core.io;

/**
 * 资源加载器接口
 *
 * @author 刘康炼
 * @date 2023/8/29
 * @time 16:00
 * @Description
 */
public interface ResourceLoader {

	Resource getResource(String location);
}
