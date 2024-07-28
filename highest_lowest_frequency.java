package Hashing_Concept;
import java.util.*;
public class highest_lowest_frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		//Brute Force Approach
		//Approach1(arr);     // Complexity: O(n*n)
		
		// Boolean Array Approach 
		//Approach2(arr);       //Complexity: O(n*n)
		
		// Using map
		Approach3(arr);       // Complexity: O(n)
	}
public static void Approach1(int[]arr)
{
	int n=arr.length;
	int max=0;
	int max_value=arr[0];
	int min=n;
	int min_value=arr[0];
	for(int i=0;i<n;i++)
	{
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j])
				count++;
		}
		if(count>max)
		{
			max=Math.max(max, count);
			max_value=arr[i];
		}
		if(count<min)
		{
			min=Math.min(min, count);
			min_value=arr[i];
		}
	}
	System.out.println("Maximum Occuring = "+ max_value);
	System.out.println("Minimum Occuring = "+ min_value);	
}
public static void Approach2(int[]arr)
{
	int n=arr.length-1;
	int max=0;
	int max_value=arr[0];
	int min=n;
	int min_value=arr[0];
	boolean [] visited=new boolean[n];
	for(int i=0;i<n;i++)
	{
		if(visited[i]==true)
			continue;
		int count=0;
		for(int j=0;j<n;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				visited[j]=true;
			}
		}
		if(count>max)
		{
			max=Math.max(max, count);
			max_value=arr[i];
		}
		if(count<min)
		{
			min=Math.min(min, count);
			min_value=arr[i];
		}		
	}
	System.out.println("Maximum Occuring = "+ max_value);
	System.out.println("Minimum Occuring = "+ min_value);
}

public static void Approach3(int[] arr)
{
	int n=arr.length;
	int max=0;
	int max_value=arr[0];
	int min=n;
	int min_value=arr[0];
	HashMap <Integer, Integer> mp=new HashMap<>();
	for(int i=0;i<n;i++)
	{
		int key=arr[i];
		if(mp.containsKey(key))
			mp.put(key,mp.get(key)+1);
		else
			mp.put(key, 1);
	}
	for(Map.Entry<Integer, Integer> entry: mp.entrySet())
	{
		int count=entry.getValue();
		int element= entry.getKey();
	
		if(count>max)
		{
			max=Math.max(max, count);
			max_value=element;
		}
		if(count<min)
		{
			min=Math.min(min, count);
			min_value=element;
		}		
}
System.out.println("Maximum Occuring = "+ max_value);
System.out.println("Minimum Occuring = "+ min_value);
}
}

