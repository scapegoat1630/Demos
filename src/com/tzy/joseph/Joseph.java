package com.tzy.joseph;

import java.util.ArrayList;
import java.util.List;

public class Joseph {

	public static void main(String[] args) {
		System.out.println(new Joseph().joseph(500, 2));
	}
	public static int joseph(int totalNum,int countNum){
		int result = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= totalNum; i ++)
			list.add(i);
		int k = 0;
		while(list.size()>0){
			k = k + countNum;
			//标记索引的位置
			k = k % (list.size()) -1;
			//判断是否到队尾，到了队尾需要接到第一个
			if( k < 0){
				System.out.println(list.get(list.size() - 1));
				result = list.remove(list.size() - 1);
				k = 0;
			}else{
				System.out.println(list.get(k));
				result = list.remove(k);
			}
		}
		return result;
	}

}
