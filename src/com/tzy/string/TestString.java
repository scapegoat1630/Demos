package com.tzy.string;

public class TestString {
	private static final String privateString ="taobao";
	public static void main(String[] args) {
		test2();
	}

	private static void test1() {
		String a = "tao";
		String b = "bao";
		System.out.println(a+b == privateString);
		System.out.println(privateString.equals(a+b));
		System.out.println(a + b == a + b);
	}
	private static void test2() {
		String a = "Œ“ «–°∂π¶¡";
		System.out.println(a.length());
		for(int i = 0 ; i < a.length() ; i++){
			System.out.println(a.charAt(i));
		}
	}

}
