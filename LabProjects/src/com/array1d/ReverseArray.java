package com.array1d;

public class ReverseArray {

	public static int[] arrayShift(int arr[])
	{
		
		int lastIndex=arr.length-1;
		int lastIndexValue=arr[arr.length-1];
		
		for(int i=lastIndex;i>=0;i--)
		{
			arr[lastIndex]=arr[i];
			lastIndex--;
			System.out.print(arr[i]+" ");
		}return arr;
	}

	public static void main(String[] args) {
		int arr[]= {3,1,7,8};
		int ans[]=arrayShift(arr);

	
	}
}

