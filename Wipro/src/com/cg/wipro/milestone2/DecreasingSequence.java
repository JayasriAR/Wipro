package com.cg.wipro.milestone2;
public class DecreasingSequence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[]= {23,56,34,1,0,-1,56,78,56,3};
		int input2=input1.length;
		        int dcrCount = 0;
				int longestLen = 0;
				int spikeCount = 0;
				boolean flag = false;
				
				for (int i = 0; i < input2 - 1; i++) {			
					if (input1[i] > input1[i + 1]) {
						if (flag == false) {
							flag = true;
							spikeCount++;
						}
						
						dcrCount++;
						//System.out.println(dcrCount);
						longestLen = dcrCount > longestLen ? dcrCount : longestLen; 
					} else {
						if (flag == true) {
							flag = false;
							dcrCount = 0;
						}
					}
				}
				
				if (spikeCount > 0) longestLen++; // fixing fence post error
		        
				System.out.println(spikeCount+" longest len  "+longestLen);
		    }
		}
		
