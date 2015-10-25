package com.tzy.codeblock;

public class CodeBlock {
	static {
		System.out.println("static code block .......");
	}
	{
		System.out.println("ordinary code block .......");
	}

	public CodeBlock() {
		System.out.println("constructor method");
	}

	public static void main(String[] args) {
		new Son();
		new Son();
	}

}

class Son extends CodeBlock {
	static {
		System.out.println("son static code block .......");
	}
	{
		System.out.println("son ordinary code block .......");
	}

	public Son() {
		System.out.println("son constructor method");
	}
}
