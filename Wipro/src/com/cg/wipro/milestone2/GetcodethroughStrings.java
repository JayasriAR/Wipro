package com.cg.wipro.milestone2;
//Length of the word “Wipro” = 5
//Length of the word “Technologies” = 12
//Let us add all the lengths to get the Total Length = 5 + 12 = 17
//The Total Length = 17 , which is not a single-digit, so now let us continuously add all digits till we get a single digit i.e. 1+ 7 = 8
//Therefore, the single-digit numeric PIN = 8

public class GetcodethroughStrings {

	public static void main(String[] args) {
	 String input1="Wipro Technologies";
	 String s[]=input1.split(" ");
	 int sum=0;
	 for(int i=0;i<s.length;i++) {
		 sum+=s[i].length();
		 }
	 if(sum<10) 
		 System.out.println("Sum "+sum);
	 int n;
	 while(sum>9) {   //until the sum become Single digit loop runs
		 n=sum;
		 sum=0;
		 while(n>0) {
			 sum+=n%10;
			 n=n/10;
		 }
	}
	 System.out.println("Sum "+sum);

}
}