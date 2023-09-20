package org.klframework.core.io;



import java.net.MalformedURLException;
import java.net.URL;
/**
 * 默认资源加载器
 *
 * @author 刘康炼
 * @date 2023/8/29
 * @time 16:04
 * @Description
 */
public class DefaultResourceLoader implements ResourceLoader {

	public static final String CLASSPATH_URL_PREFIX = "classpath:";

	@Override
	public Resource getResource(String location) {
		if (location.startsWith(CLASSPATH_URL_PREFIX)) {
			//classpath下的资源
			return new ClassPathResource(location.substring(CLASSPATH_URL_PREFIX.length()));
		} else {
			try {
				//尝试当成url来处理
				URL url = new URL(location);
				return new UrlResource(url);
			} catch (MalformedURLException ex) {
				//当成文件系统下的资源处理
				return new FileSystemResource(location);
			}
		}
	}
}