package org.klframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * 在BeanDefinition中增加和bean属性对应的PropertyValues，
 * 实例化bean之后，为bean填充属性(AbstractAutowireCapableBeanFactory#applyPropertyValues)。
 * 
 * @author 刘康炼
 * @date 2023/8/29
 * @time 14:54
 * @Description
 */
public class PropertyValues {

	private final List<PropertyValue> propertyValueList = new ArrayList<>();

	public void addPropertyValue(PropertyValue pv) {
		propertyValueList.add(pv);
	}

	public PropertyValue[] getPropertyValues() {
		return this.propertyValueList.toArray(new PropertyValue[0]);
	}

	public PropertyValue getPropertyValue(String propertyName) {
		for (int i = 0; i < this.propertyValueList.size(); i++) {
			PropertyValue pv = this.propertyValueList.get(i);
			if (pv.getName().equals(propertyName)) {
				return pv;
			}
		}
		return null;
	}
}
