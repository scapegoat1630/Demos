package com.tzy.collection;

import java.util.*;

public class TestCollections {
	public static void main(String[] args) {
		new TestCollections().test3();
	}
	public void test1(){
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "ab");
		map.put(4, "ab");
		map.put(4, "ab");
		Iterator<Map.Entry<Integer,String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer,String> entry = iterator.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	public void test2(){
		ArrayList<? extends Object> arrayList = new ArrayList<String>();
		Properties  prop = System.getProperties();
		Iterator it = prop.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry entry=(Map.Entry)it.next();
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key +":"+value);
		}
	}
	public void test3(){
		Set<Long> timstamp = new HashSet<>();
		timstamp.add(1990000l);
		if(timstamp.contains(1990000l)){
			timstamp.add(1990000l);
			System.out.println("xxx");
		}

	}



}

