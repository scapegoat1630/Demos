package com.tzy.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
			int[] a={1,4,5,3,8,7,0,6,2,9};
			SelectionSort(a);
			System.out.println(Arrays.toString(a));
	}
	public static void SelectionSort(int[] n){
		int out;
		int in;
		int min;
		for(out = 0; out < n.length - 1; out++){
			min = out;
			for(in = out + 1; in < n.length; in ++){
				if(n[in] < n[min])
					min = in;
			}
			swap(n,out,min);
		}
	}
	public static void swap(int[] n, int begin, int end){
		int temp = n[begin];
		n[begin] = n[end];
		n[end] = temp;
	}
}
