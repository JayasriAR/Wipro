package com.cg.wipro.milestone2;
public class EncodeThreeStrings {
	public static void main(String[] args) {
//		Input1= “John”
//		Input2= “Johny”
//		Input3= “Janardhan”
//      Output1 = “J” + “Jo” + “Jan” = “JJoJan”
//		Output2 = “oh” + “h” + “ard” = “ohhard”
//		Output3 = “n” + “ny” + “han” = “nnyhan”

		 String input1="John";
		 String input2="Johny";
		 String input3="Janardhan";
		 String s[]= {input1,input2,input3};
		 String first="",middle="", last="";
		 
		 int i,n=0;
		 for(i=0;i<3;i++) {
		 if(s[i].length()%3==0||s[i].length()%3==1) {
			 n=0;
		 n=s[i].length()/3;
		 first=first+s[i].substring(0,n);
		 middle=middle+s[i].substring(n, s[i].length()-n);
		 last=last+s[i].substring(s[i].length()-n, s[i].length());
		 }
//		 if(s[i].length()%3==1) {
//	     n=0;
//		 n=s[i].length()/3;
//		 first=first+s[i].substring(0,n);
//		 middle=middle+s[i].substring(n, s[i].length()-n);
//		 last=last+s[i].substring(s[i].length()-n, s[i].length());
//		 }
		 if(s[i].length()%3==2) {
			 n=0;
			 n=s[i].length()/3;
		 first=first+s[i].substring(0,n+1);
		 middle=middle+s[i].substring(n+1, s[i].length()-n-1);
		 last=last+s[i].substring(s[i].length()-n-1,s[1].length());
		 }
		 }
		 System.out.println(first);
		 System.out.println(middle);
		 System.out.println(last.toUpperCase());
		 }
}
