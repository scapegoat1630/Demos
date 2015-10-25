package com.tzy.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class TestCollections {
	public static void main(String[] args) {
		ArrayList<? extends Object> arrayList = new ArrayList<String>();
		//arrayList.add("aa");
		Properties  prop = System.getProperties();
		Iterator it = prop.entrySet().iterator();
		while(it.hasNext()){
			 Map.Entry entry=(Map.Entry)it.next();
			    Object key = entry.getKey();
			    Object value = entry.getValue();
			    System.out.println(key +":"+value);
		}
	}
}
