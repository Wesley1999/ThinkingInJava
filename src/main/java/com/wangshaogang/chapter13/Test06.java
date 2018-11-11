/**
 * 正则
 *
 * @author 王少刚
 * @create 2018-11-10 13:54
 */
package com.wangshaogang.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test06 {
	public static void main(String[] args) {

		// 判断
		String email = "1095151731@qq.com";
		String pattern1 = "^\\w*@\\w*\\.\\w*$";
		boolean isMatch = Pattern.matches(pattern1, email);
		System.out.println(isMatch);
		System.out.println("---------------------------------");

		// 分割
		String string2 = "1.2.3.4.5.6.7";
		String pattern2 = "\\.";
		String[] regexes = string2.split(pattern2);
		for (String s : regexes) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");

		// 匹配
		String string3 = "10+20*30+40*50+60/70+80-90=";
		Pattern pattern3 = Pattern.compile("(\\d*[*|/]\\d*)");
		Matcher matcher3 = pattern3.matcher(string3);
		while (matcher3.find()) {
			System.out.println(matcher3.group());
		}
		System.out.println("---------------------------------");

		// 匹配
		String email4 = "a1095151731@qq.com";
		Pattern pattern4 = Pattern.compile("@(\\w+).+");
		Matcher m = pattern4.matcher(email4);
		while (m.find()) {
			// group()方法的参数可以指定是第几个括号中的值
			System.out.print(m.group(1) + " ");
		}
		System.out.println();
		System.out.println("---------------------------------");

		// 替换
		String string5 = "10+20*30+40*50+60/70+80-90=";
		String pattern5 = "(\\d*[*|/]\\d*)";
		String s = string5.replaceAll(pattern5, "aaa");
		System.out.println(s);
		System.out.println("---------------------------------");



	}
}
