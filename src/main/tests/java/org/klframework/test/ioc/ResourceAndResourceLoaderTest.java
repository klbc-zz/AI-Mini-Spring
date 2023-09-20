package org.klframework.test.ioc;

import cn.hutool.core.io.IoUtil;
import org.junit.Test;
import org.klframework.core.io.DefaultResourceLoader;
import org.klframework.core.io.FileSystemResource;
import org.klframework.core.io.Resource;
import org.klframework.core.io.UrlResource;

import java.io.InputStream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ResourceAndResourceLoaderTest {

	@Test
	public void testResourceLoader() throws Exception {
		DefaultResourceLoader resourceLoader = new DefaultResourceLoader();

		//加载classpath下的资源
		Resource resource = resourceLoader.getResource("classpath:hello.txt");
		InputStream inputStream = resource.getInputStream();
		String content = IoUtil.readUtf8(inputStream);
		System.out.println(content);
		assertThat(content).isEqualTo("hello world2");

		//加载文件系统资源
		resource = resourceLoader.getResource("src/main/tests/resources/hello.txt");
		assertThat(resource instanceof FileSystemResource).isTrue();
		inputStream = resource.getInputStream();
		content = IoUtil.readUtf8(inputStream);
		System.out.println(content);
		assertThat(content).isEqualTo("hello world");

		//加载url资源
		resource = resourceLoader.getResource("https://www.baidu.com");
		assertThat(resource instanceof UrlResource).isTrue();
		inputStream = resource.getInputStream();
		content = IoUtil.readUtf8(inputStream);
		System.out.println(content);
	}
}