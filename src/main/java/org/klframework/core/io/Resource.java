package org.klframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * 资源的抽象和访问接口
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 16:00
 * @Description 
 */
public interface Resource {

	InputStream getInputStream() throws IOException;

}
