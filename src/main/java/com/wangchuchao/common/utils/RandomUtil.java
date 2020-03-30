package com.wangchuchao.common.utils;

import java.util.Random;
	/**
	 * 
	 * @ClassName: RandomUtil 
	 * @Description: 随机数工具类
	 * @author: 61466
	 * @date: 2020年3月30日 下午3:19:30
	 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	/**
	 * 
	 * @Title: random 
	 * @Description: 返回min-max之间的随机整数
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max){
		Random random = new Random();
		int nextInt = random.nextInt((max-min+1))+min;
		return nextInt;
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: 最小值min与最大值max之间截取subs个不重复的随机数
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static int[] subRandom (int min, int max, int subs){
		int[] list=new int[subs];
		int number;
		boolean flag;
		int i=0;
		while(i<subs) {
			flag=true;
			number=random(min, max);
			for (int j = 0; j < i; j++) {
				if(number==list[j]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				list[i]=number;
				i++;
			}
		}
		return list;
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: 返回1个1-9,a-Z之间的随机字符
	 * @return
	 * @return: char
	 */
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		char s = str.charAt(random(0, str.length()-1));
		return s;
	//TODO 实现代码
	}
	/**
	 * 
	 * @Title: randomString 
	 * @Description: 返回参数length个字符串
	 * @param length
	 * @return
	 * @return: String
	 */
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		String str="";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		return str;
	
	}

}
