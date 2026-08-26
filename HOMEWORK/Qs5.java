/*Question 5: Write a Java program to calculate average of numbers using Integer wrapper class with autoboxing and unboxing.
Asked In Practice Assignment
Input:
Enter size: 4
Enter numbers: 10 20 30 40

Output:
Average is: 25

Explanation:
Read 4 numbers as primitive int, store in Integer array (autoboxing). To calculate average, sum all elements by unboxing each Integer to int, then divide by count. Average = Sum / Count = (10+20+30+40) / 4 = 100 / 4 = 25.

lightbulb Take a Help*/


import java.util.*;
class Qs2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(Integer num : arr)
		{
		
		 sum=sum+num;
		}
		int avg=sum/arr.length;
		
		System.out.println("Average : "+ avg);
	}
}