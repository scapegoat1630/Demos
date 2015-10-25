package com.tzy.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Collection {
	  final byte  i = 1;
	    int j;
	    public void doSomething() {
	        System.out.println(++j + i);
	    }
	public static void main(String[] args) throws FileNotFoundException {
		 byte a1 = 2, a2 = 4, a3;
		  short s = 16;
		  int i=0;
		  Integer j = new Integer(0);
		  System.out.println(i==j);
		  System.out.println(j.equals(i));
		short a = 128;
		System.out.println(a);
		System.out.println((byte)(a));
		BufferedReader reader = new BufferedReader(new FileReader(new File("")));
	}

}
