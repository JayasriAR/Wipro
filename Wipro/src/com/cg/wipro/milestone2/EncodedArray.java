package com.cg.wipro.milestone2;

public class EncodedArray {
//	If the encoded array is {7,6,8,16,12,3}
//	The Original array should have been {2,5,1,7,9,3}
//	So, First number in original array = 2
//	Sum of all numbers in original array = 27
	public static void main(String[] args) {
		int input1[]= {7,6,8,16,12,3};
		int[] out = new int[input1.length];
		out[out.length - 1] = input1[input1.length - 1];
		
		for (int i = input1.length - 1; i > 0; i--) {
			out[i - 1] = input1[i - 1] - out[i];
		}
		
		int sum = 0;
		for (int item : out)
			sum += item;
        System.out.println("first number "+out[0]+" sum of elements "+sum);
        }

	}
