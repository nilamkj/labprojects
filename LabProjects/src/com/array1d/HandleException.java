package com.array1d;

public class HandleException {
	public static void decrementNumber(int arr[])
	{
		int len=arr.length;
		int temp=0;
		
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1;j++)
			{
			if(arr[i]<arr[i+1])
			{
				temp=arr[i+1];
			    arr[i+1]=arr[i];
			    arr[i]=temp;
			}
		}
	}
		for(int n:arr)
		{
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		int num[]= {5,6,7,1};
		try {
				decrementNumber(num);
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

