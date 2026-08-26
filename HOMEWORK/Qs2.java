/*Question 2: Write a Java program to count even numbers using the autoboxing and unboxing concept.
Asked In Practice Assignment
Input:
Enter size: 6
Enter numbers: 11 22 33 44 55 66

Output:
Total even numbers: 3

Explanation:
This program demonstrates autoboxing (int ? Integer) and unboxing (Integer ? int). Read 6 numbers from user as primitive int. Each number assigned to Integer array triggers autoboxing. To check even condition, unboxing converts Integer back to int. A number is even if divisible by 2 (number % 2 == 0). Numbers 22, 44, 66 are even. Count = 3.*/


import java.util.*;
class Qs2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(Integer num : arr)
		{
		  if(num%2==0)
		  {
			  count++;
			  System.out.println(num + " ");
		  }
		}
		System.out.println("Count : "+ count);
	}
}