# Wipro Practice Repository - Milestone 2

Welcome to my Wipro practice repository! This repository contains a collection of practice questions and their corresponding answers for Milestone 2.
I have a strong interest in logic building, and this repository reflects my efforts to develop and refine my logical thinking skills.
### Question 1:
**Decreasing sequence:** 
Given an integer array, find the number of decreasing sequences in the array and the length of its longest decreasing sequence.
You are expected to complete the logic within the given function, where, 
input1 represents the integer array and,
input2 represents the number of elements in the integer array
The function should set the  output1 variable to the number of decreasing sequences in the array, and set the  output2 variable to the length of the longest decreasing sequence in the array.

Example 1: 
If  input1[ ] = {11,3,1,4,7,8,12,2,3,7} 
and  input2 = 10
output1 should be 2
output2 should be 3
Explanation: 
In the given array  input1, the decreasing sequences are “11,3,1” and “12,2”, i.e. there are two decreasing sequences in the array, and so  output1 is assigned  2. The first sequence i.e. “11,3,1” is the longer one containing  three items, when compared to the second sequence “12,2” which contains 2 items. So, the length of the longest decreasing sequence  output2 =  3.

Example 2: 
If  input1[ ] = {9} 
and  input2 = 1
output1 should be 0
output2 should be 0

Example 3: 
If  input1[ ] = {12,51,100,212,15,12,7,3,57,300,312,78,19,100,102,101,99,74,0,-5} 
and  input2 = 20
output1 should be 3
output2 should be 6
**Answer:** [https://github.com/JayasriAR/Wipro/blob/master/Wipro/src/com/cg/wipro/milestone2/DecreasingSequence.java](#question-1)


### Question 2:
**Encoding Three Strings:** Anand was assigned the task of coming up with an encoding mechanism for any given three strings. He has come up with the below plan.

**STEP ONE**: Given any three strings, break each string into 3 parts each.
For example – If the three strings are as below -
Input1= “John”
Input2= “Johny”
Input3= “Janardhan”
“John” should be split into “J”, “oh”, “n” as the FRONT, MIDDLE and END parts respectively.
 “Johny” should be split into “Jo”, “h”, “ny” as the FRONT, MIDDLE and END parts respectively.
“Janardhan” should be split into “Jan”, “ard”, “han” as the FRONT, MIDDLE and END parts respectively.
i.e. if the no. of characters in the string are in multiples of 3, then each split-part will contain equal no. of characters, as seen in the example of “Janardhan”
If the no. of characters in the string are NOT in multiples of 3, and if there is one character more than multiple of 3, then the middle part will get the extra character, as seen in the example of “John”
If the no. of characters in the string are NOT in multiples of 3, and if there are two characters more than multiple of 3, then the FRONT and END parts will get one extra character each, as seen in the example of “Johny”

**STEP TWO:**  Concatenate (join) the FRONT, MIDDLE and END parts of the strings as per the below specified concatenation-rule to form three Output strings.
Output1 = FRONT part of Input1 + FRONT part of Input2 + FRONT part of Input3
Output2 = MIDDLE part of Input1 + MIDDLE part of Input2 + MIDDLE part of Input3
Output3 = END part of Input1 + END part of Input2 + END part of Input3
For example, for the above specified example input strings,
Output1 = “J” + “Jo” + “Jan” = “JJoJan”
Output2 = “oh” + “h” + “ard” = “ohhard”
Output3 = “n” + “ny” + “han” = “nnyhan”

**Step THREE**: After the first two steps, we will have three output strings. Further processing is required only for the third output string as per below rule –
“ Toggle the case of each character in the string”, i.e. in the third output string, all lower-case characters should be made upper-case and vice versa.
For example, for the above example strings, Output3 is “nnyhan”, so after applying the toggle rule, Output3 should become “NNYHAN”.
Final Result – The three output strings after applying the above three steps is the final result. i.e. for the above example,
Output1 = “JJoJan”
Output2 = “ohhard”
Output3 = “NNYHAN”
Anand approaches you to help him write a program that would do the above mentioned processing on any given three strings and generate the resulting three output strings
Note that the three output strings should be returned as members of a "Result" object/struct.

 **Answer:** [https://github.com/JayasriAR/Wipro/blob/master/Wipro/src/com/cg/wipro/milestone2/EncodeThreeStrings.java]

### Question 3:
**Simple Encoded Array:** Maya has stored few confidential numbers in an array (array of int). To ensure that others do not find the numbers easily, she has applied a simple encoding.
Encoding used : Each array element has been substituted with a value that is the sum of its original value and its succeeding element’s value.
i.e. arr[i] = original value of ​arr[i] + original value of ​arr[i+1]
e.g. value in arr[0] = original value of arr[0] + original value of arr[1]
Also note that value of last element i.e. arr[last index] remains unchanged.

For example, 
If the encoded array is {7,6,8,16,12,3}
The original array should have been {2,5,1,7,9,3}
Provided the encoded array, you are expected to find the –
First number (value in index 0) in the original array
Sum of all numbers in the original array

Write the logic in the function  findOriginalFirstAndSum(int[] input1, int input2);
where, 
input1 represents the encoded array, and 
input2 represents the number of elements in the array input1

The method is expected to –
find the value of the first number of the original array and store it in the member output1 and
find the sum of all numbers in the original array and store it in the member output2
Note that the output1 and output2 should be returned as -
- members of a Result object (if the code is being written in Java, C# or C++)
- members of a Result struct  (if the code is being written in C)
Assumption: The array elements can be positive and/or negative numbers

Example 1:
If the encoded array is {7,6,8,16,12,3}
The Original array should have been {2,5,1,7,9,3}
So, First number in original array = 2
Sum of all numbers in original array = 27

Example 2:
If the encoded array is {-2,-7,-12,-15}
The Original array should have been {8,-10,3,-15}
So, First number in original array = 8
Sum of all numbers in original array = -1
**Answers:** [https://github.com/JayasriAR/Wipro/blob/master/Wipro/src/com/cg/wipro/milestone2/EncodedArray.java]

### Question  4:
**FindStringCode**
Crazy Zak has designed the below steps which can be applied on any given string (sentence) to produce a number.
STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
STEP2. Concatenate the sums of each word to form the result.
For example –
If the given string is “WORLD WIDE WEB”

**STEP1.** In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word.
WORLD = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
WIDE = [W-E]+[I-D] = [23-5]+[9-4] = [18]+[5] = [23]
WEB = [W-B]+[E] = [23-2]+[5] = [21]+[5] = [26]

**STEP2.** Concatenate the sums of each word to form the result
[40] [23] [26]
[402326]
The answer (output) should be the number 402326.
NOTE1:The value of each letter is its position in the English alphabet system i.e. a=A=1, b=B=2, c=C=3, and so on till z=Z=26.
So, the result will be the same for “WORLD WIDE WEB” or “World Wide Web” or “world wide web” or any other combination of uppercase and lowercase letters.
IMPORTANT Note: In Step1, after subtracting the alphabets, we should use the absolute values for calculating the sum. For instance, in the below example, both [H-O] and [E-L] result in negative number -7, but the positive number 7 (absolute value of -7) is used for calculating the sum of the differences.
Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26]
Assumptions: The given string (sentence) will contain only alphabet characters and there will be only one space character between any two consecutive words.
You are expected to help Zak, by writing a function that takes a string (sentence) as input, performs the above mentioned processing on the sentence and returns the result (number).
Example1:
input1 = “World Wide Web”
output1 = 402326
Example2:
input1 = “Hello World”
output1 = 2640
Explanation:
Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26]
World = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40]
Result = Number formed by concatenating [26] and [40] = 2640

Answer: [https://github.com/JayasriAR/Wipro/blob/master/Wipro/src/com/cg/wipro/milestone2/Findstringcode.java]
