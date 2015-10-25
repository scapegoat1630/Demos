package com.tzy.extend;

public class TestExtend {
	public TestExtend(){
		System.out.println("123");
	}
	public class Child extends TestExtend{
		public Child(){
			System.out.println("456");
		}
	}
	public static void main(String[] args){
		TestExtend father=new TestExtend();
		TestExtend.Child child=father.new Child();
	}


}
