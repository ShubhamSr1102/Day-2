package com.capgemini.Assignment2;

public class Distinct {

	public static int find(int[] array, int size) {
		int temp;
		for(int i = 0; i < size-1; i++)
		{
			for(int j = 0; j < size-i-1; j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}
			}
		}
				
		for(int i =0; i < size; i++)
		{
			if(array[i]!=i)
			{
				return i;
			}
		}
		
		return -1;
	}

}
