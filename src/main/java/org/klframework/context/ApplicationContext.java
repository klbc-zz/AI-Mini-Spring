package org.klframework.context;

import org.klframework.beans.factory.HierarchicalBeanFactory;
import org.klframework.beans.factory.ListableBeanFactory;
import org.klframework.core.io.ResourceLoader;

/**
 * 应用上下文
 *
 * @author 刘康炼
 * @date 2023/9/21
 * @time 15:49
 * @Description
 */
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader {

}
