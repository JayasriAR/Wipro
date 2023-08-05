package com.cg.wipro.milestone2;
//input1 = “Hello World”
//output1 = 2640
//Explanation:
//Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26]
//World = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
//Result = Number formed by concatenating [26] and [40] = 2640
public class Findstringcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1="Hello World";
		String str=input1.toUpperCase();    
		String word[]=str.split(" ");    
		String value2="";    
		for(int i=0;i<word.length;i++)    {     
		int sum=0;     
		for(int j=0;j<word[i].length()/2;j++)     {      
		int first=word[i].charAt(j);      
		int last=word[i].charAt(word[i].length()-1-j);       
		sum+=Math.abs(first-last);     
		}    
		 if(word[i].length()%2!=0)     
		sum+=(word[i].charAt(word[i].length()/2)-64);          
		String value=Integer.toString(sum);         
		  value2+=value;   
		 }   
		 System.out.println(Integer.parseInt(value2));
	}

}
