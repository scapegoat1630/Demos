package com.tzy.objectserialize;

import java.io.*;

public class ObjectSerialize {
	public static void main(String[] args) throws Exception {
		A oa1 = new A("测试", 1, 2, 3);
		FileOutputStream fos = new FileOutputStream("fs.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oa1);
		oos.close();
		FileInputStream fs = new FileInputStream("fs.txt");
		ObjectInputStream ois = new ObjectInputStream(fs);
		A oa3 = (A) ois.readObject();
		System.out.println(oa3.name + "," + oa3.a + "," + oa3.b + "," + oa3.c);
	}
}

class A implements Serializable {
	static String name;
	int a;
	static int b = 0;
	transient int c;

	public A(String name, int a, int b, int c) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}
}