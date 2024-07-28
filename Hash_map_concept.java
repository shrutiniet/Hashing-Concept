package Hashing_Concept;
import java.util.*;
public class Hash_map_concept {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		HashMap<Integer,Integer> mp=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			int key=arr[i];
			int freq=0;
			if(mp.containsKey(key)) 
				freq= mp.get(key);
			freq++;
			mp.put(key, freq);
		}
		
		
		System.out.println("Enter test cases= ");
		int test=sc.nextInt();
		while(test>0)
		{
			System.out.println("Enter no=");
			int no=sc.nextInt();
			if(mp.containsKey(no))
				System.out.println(mp.get(no));
			else
				System.out.println(0);
			test--;
		}
	}

}
