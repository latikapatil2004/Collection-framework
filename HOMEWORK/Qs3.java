/*Question 3: Write a Java program to find the maximum number using Integer wrapper objects created through autoboxing.
Asked In Practice Assignment
Input:
Enter size: 4
Enter numbers: 45 78 12 90

Output:
Maximum number is: 90

Explanation:
Read 4 numbers as primitive int and store in Integer array via autoboxing. To find maximum, initialize max with first element (or Integer.MIN_VALUE). Loop through array, unbox each Integer to int during comparison. Compare current element with max. If current > max, update max value. After loop completes, max contains largest value 90.*/

import java.util.*;
class Qs3
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
		int max=arr[0];
		for(Integer num : arr)
		{
		  if(num>max)
		  {
			  max=num;
			  
		  }
		}
		System.out.println("Maximum : "+ max);
	 }
}

		 
	
  