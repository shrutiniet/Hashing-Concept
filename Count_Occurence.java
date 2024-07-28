package Hashing_Concept;
import java.util.Scanner;
public class Count_Occurence {
	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		// BRUTE FORCE
//		System.out.println("Enter no= ");
//		int no=sc.nextInt();
//		System.out.println(Count(no,arr));
		
		// HASHING CONCEPT
		Hashing(arr);
		

	}
public static int Count(int n, int[] arr)
{
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==n)
			count++;
	}
	return count;
}
public static void Hashing(int[]arr)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter test case=");
	int test=sc.nextInt();
	int[] hash=new int[15];
	//precompute
	for(int i=0;i<arr.length;i++)
	{
		hash[arr[i]]++;
	}
	//fetching
	while(test>0)
	{
		System.out.println("Enter no=");
		int no=sc.nextInt();
		System.out.println(no +" appears "+ hash[no]);
		test--;
	}
}
}
