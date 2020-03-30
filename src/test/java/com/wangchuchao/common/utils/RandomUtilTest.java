package com.wangchuchao.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @ClassName: RandomUtilTest 
 * @Description: 随机数测试类
 * @author: 61466
 * @date: 2020年3月30日 下午3:20:06
 */
public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 3);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 5);
		for (int i : subRandom) {
			
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}

	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(9));
	}

}
