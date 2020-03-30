package com.wangchuchao.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.wcc.util.utils.DateUtil;
/**
 * 
 * @ClassName: PersonTest 
 * @Description: Person������
 * @author: 61466
 * @date: 2020��3��30�� ����3:16:46
 */
public class PersonTest {

	@Test
	public void test1() {
		for (int i = 0; i <10000; i++) {
			Person person = new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			Calendar in = Calendar.getInstance();
			in.set(2010, 0, 1);
			Date created = DateUtil.randomDate(in.getTime(), new Date());
			person.setCreated(created);
			
			System.out.println(i+":"+person);
		}
	}

}
