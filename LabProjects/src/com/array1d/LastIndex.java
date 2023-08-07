package com.array1d;
//shifted last element
public class LastIndex {
	
	public static int[] arrayShift(int arr[])
	{
		int i;
		int lastIndex=arr.length-1;
		int lastIndexValue=arr[arr.length-1];
		
		for(i=arr.length-2;i>=0;i--)
		{
			arr[lastIndex]=arr[i];
			lastIndex--;
			
			if(i==0)
			{
				arr[i]=lastIndexValue;
			}
		}return arr;
	}

	public static void main(String[] args)
	{
		int num[]= {4,5,6,7};
		int ans[]=arrayShift(num);
		for(int n:ans)
		{
			System.out.println(n);
		}
		}
		
	}


