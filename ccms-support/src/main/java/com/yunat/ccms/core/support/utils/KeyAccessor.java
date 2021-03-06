/**
 * 
 */
package com.yunat.ccms.core.support.utils;

/**
 * @author Administrator
 */
public interface KeyAccessor<K, V> {
	/**
	 * 从对象中抽取一个字段的值.
	 * 可用于存入(id-对象)的map中
	 * 可用于"外键关联"
	 * 
	 * @param value
	 * @return
	 */
	public K extract(V value);
}
