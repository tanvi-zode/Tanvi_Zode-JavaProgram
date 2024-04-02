// Write a program to find common elements between two arrays

import java.util.Arrays;

public class ArrayCommonInteger
{
	public static void main(String[] args) 
	{
		
		int[] array1 = {1993,1995,2000,2006,2017,2020};
		int[] array2 = {1990,1993,1995,2010,2016,2017};

		
		System.out.println("Array1 : "+Arrays.toString(array1));
		System.out.println("Array2 : "+Arrays.toString(array2));


		for (int i = 0; i < array1.length; i++)
		{
			for (int j = 0; j < array2.length; j++)
			{
				if(array1[i] == (array2[j]))
				{
					System.out.println("Common element is : "+(array1[i]));
				}
			}
		}
	}
}
