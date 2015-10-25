package com.tzy.xiecheng;

public class PrintMatrix {

	public static void main(String[] args) {
		boolean b = true ? false : true == true ? false : true;
		System.out.println(b);
	}
	public static void printMatrix(int[][] matrix){
		if(matrix == null)
			return;
		int beginX = 0;
		int beginY = 0;
		int endX = matrix.length - 1;
		int endY = matrix[0].length - 1;
		
	}
	public static void printMatrix(int[][] matrix,int beginX,int beginY,int endX,int endY){
		//只剩下一行的时候
		if(beginX == endX){
			for(int i = beginY; i <= endY; i++){
				System.out.println(matrix[beginX][i]);
			}
			return;
		}
		//只剩下一列的时候
		if(beginY == endY){
			for(int i = beginX ; i <= endX; i++){
				System.out.println(matrix[i][beginY]);
			}
		}
		//打印一行
		for(int i = beginY; i <= endY; i++){
			System.out.println(matrix[beginX][i]);
		}
		//打印一列
		for(int i = beginX ; i <= endX; i++){
			System.out.println(matrix[i][beginY]);
		}
		//倒着打印最后一行
		for(int i = endY; i <= beginY; i--){
			System.out.println(matrix[endX][i]);
		}
		//倒着打印最后一列
		for(int i = endX ; i <= beginX; i++){
			System.out.println(matrix[i][beginY]);
		}
	}

}
