/*Question 4: Write a Java program to swap two Integer values using autoboxing and unboxing.
Asked In Practice Assignment
Input:
Enter first number: 25
Enter second number: 75

Output:
Before swapping: 25 75
After swapping: 75 25

Explanation:
Read two numbers as primitive int. Assign to Integer objects (autoboxing occurs). To swap, convert (unbox) to primitive variables, use temporary variable to hold one value, then exchange. Display before and after values. Autoboxing allows seamless conversion int ? Integer, unboxing allows Integer ? int.*/

import java.util.*;
class Qs4
{
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 Integer a=10;
		 int b=12;
		  System.out.println("Before swapping  "+ a +" " + b);
		 
		 int temp=a;
		 a=b;
		 b=temp;
		
		  System.out.println("after swapping   "+ a +" " + b);
	 }
}
