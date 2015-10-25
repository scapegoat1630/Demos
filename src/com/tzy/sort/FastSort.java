package com.tzy.sort;

public class FastSort {

	public static void main(String[] args) {

	}
	public static void sort(int[] n,int begin,int end){
		if(begin < end){
			int temp = patation(n, begin, end);
			sort(n, temp + 1, end);
			sort(n,begin,temp - 1);
		}
	}
	public static int patation(int[] n,int begin ,int end){
		int temp = n[begin];
		while(begin <end){
			while(begin < end && n[end] > temp){
				end--;
			}
			n[begin] = n[end];
			while(begin < end && n[begin] < temp ){
				begin++;
			}
			n[end] = n[begin];
		}
		n[begin] = temp;
		return begin;
	}

}
