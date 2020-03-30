package com.wangchuchao.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @ClassName: StringUtilTest 
 * @Description: 字符串测试类
 * @author: 61466
 * @date: 2020年3月30日 下午3:20:22
 */
public class StringUtilTest {

	@Test
	public void testHasLength() {
		String src=" ";
		boolean hasLength = StringUtil.hasLength(src);
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		String src="  ";
		boolean hasLength = StringUtil.hasText(src);
		System.out.println(hasLength);
	}

	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(11));
	}

	@Test
	public void testGenerateChineseName() {
		System.out.println(StringUtil.generateChineseName());
	}

}
