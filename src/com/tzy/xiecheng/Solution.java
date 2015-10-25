package com.tzy.xiecheng;

public class Solution {

	public static void main(String[] args) {

	}

	public void twoSum(int[] numbers, int target) {
		int one = 0;
		int two = numbers.length - 1;
		while (one < two) {
			if (numbers[one] + numbers[two] == target) {
				System.out.println("the first number is " + numbers[one]
						+ "; the second number is " + numbers[two]);
			} else if (numbers[one] + numbers[two] < target) {
				one++;
			} else if (numbers[one] + numbers[two] > target) {
				two--;
			}
		}
	}

}
