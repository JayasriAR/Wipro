package com.cg.wipro.milestone2;

public class NonprimeIndex {

	public static void main(String[] args) {
		int[] input1= {10,20,30,40,50,60,70,0,90,100};
		//non prime index values --> 10,20,50,70,90,100(consider index 0,1 as nonprime)
		int input2=input1.length;
		int sum=0;
		for(int i=0;i<input2;i++) {
			boolean isPrime = true;
			 if(i<=1) {
				 isPrime = false;
			 }
			 
			 for(int j=2;j<=i/2;j++) { 
				 if(i%j==0) {  //if index is prime
					 isPrime=false;
					 break;
				 }
			 }
			 if(!isPrime) {
				 sum+=input1[i];
			 }
		}
		System.out.println("Sum of elements at non prime index: "+sum);
	}

}
