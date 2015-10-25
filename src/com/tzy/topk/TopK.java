package com.tzy.topk;

public class TopK {

	public static void main(String[] args) {
	}
	public static int[] getTopKByHeap(int[] array,int k){
		if(k < 1 || array == null || array.length >= k)
			return array;
		int[] results = new int[k];
		for(int i = 0; i < k; i++)
			heapInsert(results,array[i],i);
		for(int i = k ; i < array.length; i++){
			if(array[i] < results[0]){
				results[0] = array[i];
				heapify(array, 0, k);
			}
		}
		return results;
	}
	//大顶堆的插入
	public static void heapInsert(int[] array,int value,int index){
		array[index] = value;
		while(index != 0){
			int parent = (index - 1) / 2;
			if(array[parent] < array[index]){
				swap(array, parent, index);
				index = parent;
			}
			else
				break;
		}
	}
	public static void heapify(int[] array,int index, int heapSize){
		int left = index * 2 + 1;
		int right = index * 2 + 2;
		int largest = index;
		while(left < heapSize){
			if(array[left] > array[index])
				largest = index;
			if(right < heapSize && array[right] > array[index])
				largest = index;
			if(largest != index)
				swap(array,index,largest);
			else
				break;
			index = largest;
			left = index * 2 + 1;
			right = index * 2 + 2;
		}
	}
	public int partition(int[] nums,int low,int high){
		int pivot = nums[low];
		while(low < high){
			while(low < high && nums[high] >= pivot)
				high--;
			nums[high] = nums[low];
			while(low < high && nums[low] <= pivot)
				low++;
			nums[high] = nums[low];
		}
		nums[low] = pivot;
		return low;
		
	}
	public static void swap(int[] array,int m,int n){
		int temp = array[m];
		array[m] = array[n];
		array[n] = temp;
	}
}
