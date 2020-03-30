package com.wangchuchao.common.utils;

import java.util.Random;
	/**
	 * 
	 * @ClassName: RandomUtil 
	 * @Description: �����������
	 * @author: 61466
	 * @date: 2020��3��30�� ����3:19:30
	 */
public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	/**
	 * 
	 * @Title: random 
	 * @Description: ����min-max֮����������
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
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	/**
	 * 
	 * @Title: subRandom 
	 * @Description: ��Сֵmin�����ֵmax֮���ȡsubs�����ظ��������
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
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	/**
	 * 
	 * @Title: randomCharacter 
	 * @Description: ����1��1-9,a-Z֮�������ַ�
	 * @return
	 * @return: char
	 */
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		char s = str.charAt(random(0, str.length()-1));
		return s;
	//TODO ʵ�ִ���
	}
	/**
	 * 
	 * @Title: randomString 
	 * @Description: ���ز���length���ַ���
	 * @param length
	 * @return
	 * @return: String
	 */
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String str="";
		for (int i = 0; i < length; i++) {
			str+=randomCharacter();
		}
		return str;
	
	}

}
