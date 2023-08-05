package com.cg.wipro.milestone2;
import java.util.HashSet;

public class FirstOccuringinarray {
	public int Firstrepeated(int[] arr){
		HashSet<Integer> set=new HashSet<>();
		boolean hasNonnegative=false;
		
		for(int n:arr) {
			if(n>0) {
				hasNonnegative=true;
				if(!set.add(n)) { //add elements to set when the element repeats returns false
					return n;
				}
			}
		}
		return hasNonnegative ? arr[0]:0;
	}

	public static void main(String[] args) {
		FirstOccuringinarray f=new FirstOccuringinarray();
		int[] a= {2,3,4,5,6,3,2};
		System.out.println(f.Firstrepeated(a));
	}
}
