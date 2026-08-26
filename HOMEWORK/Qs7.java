/*Question 7: Write a Java program to convert a String value into an Integer using wrapper class methods.
Asked In Practice Assignment
Input:
Enter numeric string: 100

Output:
Converted Integer value is: 100

Explanation:
Read string input "100" from user. Use Integer.parseInt()*/



import java.util.*;
class Qs7
{
	public static void main(String[]args)
	{
		String s="100";
		int n=Integer.parseInt(s);
		System.out.println("Converted Integer value is : "+ n);
		
	}
}