package com.array2d;

public class ColumnElementPrinting {

	public static void printColumnElement(int matrix[][],int rows,int cols)
	{
		//int len=matrix.length;
		for(int i=0;i<cols;i++)
		{
			for(int j=0;j<rows;j++)
			{
				System.out.println(matrix[j][i]);
			}
			System.out.println("--------------");
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{2,7,1},{9,5,8}};
		printColumnElement(arr,2,3);
		
	}
}
