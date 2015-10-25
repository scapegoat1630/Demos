package com.tzy.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a={1,4,5,3,8,7,0,6,2,9};
		InsertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	public static void InsertionSort(int[] a){
		int in;
		int out;
		for(out = 0; out < a.length; out++){
			int temp = a[out];
			in = out;
			while(in >0 && a[in - 1] > temp){
				a[in] = a[in - 1];
				in--;
			}
			a[in] = temp;
		}
	}
	public static void swap(int[] n, int begin, int end){
		int temp = n[begin];
		n[begin] = n[end];
		n[end] = temp;
	}

}
