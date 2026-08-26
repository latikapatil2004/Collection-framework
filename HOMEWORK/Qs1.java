/*Question 1: Write a Java program to store primitive integer values into an Integer array using autoboxing and calculate their sum using unboxing.
Asked In Practice Assignment
Input:
Enter size: 5
Enter elements: 10 20 30 40 50

Output:
Sum of elements is: 150

Explanation:
Autoboxing is the automatic conversion of primitive types into their corresponding wrapper classes. Here, when primitive int values are assigned to Integer array, Java automatically converts them to Integer objects. The sum() method or loop accesses each Integer element. When performing arithmetic operations (addition), unboxing automatically converts Integer back to int. Start with sum=0, iterate through array, for each Integer element unbox to int and add to sum. Final calculation: 10+20+30+40+50 = 150.*/


class Qs1
{
	public static void main(String[]args)
	{
		Integer arr[]={1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			Integer a=arr[i];
			int b=a;
			sum = sum+b;
		}
		System.out.println("Sum : "+ sum);
	}
}