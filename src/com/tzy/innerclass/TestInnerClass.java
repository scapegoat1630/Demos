package com.tzy.innerclass;

import java.util.Scanner;


public class TestInnerClass {
	static class Inner implements InnerInterface{

		public void show() {
			System.out.println("Hello World!");
		}
		
	}
	public static void main(String[] args) {
		TestInnerClass  out = new TestInnerClass();
		TestInnerClass.InnerClass in = out.new InnerClass();
		new Inner().show();
		in.print("fuck ");
	}
	public  class InnerClass{
		//static int a = 0; 非静态内部类不能声明静态静态成员
		public  void print(String str){
			Scanner in = new Scanner(System.in);
			System.out.println(str);
		}
	}
}
interface InnerInterface{
	void show();
}