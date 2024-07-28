package Hashing_Concept;
import java.util.Scanner;
public class Character_Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		// BRUTE FORCE
//		char ch=sc.next().charAt(0);
//		System.out.println(Count(ch,str));
		
		//HASHING CONCEPT
		//Lower_Hashing(str);
		//Upper_Hashing(str);
		Upper_Lower_Hashing(str);

	}
public static int Count(char ch, String str)
{
	int count=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==ch)
			count++;
	}
	return count;
}
public static void Lower_Hashing(String str)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter test case= ");
	int test=sc.nextInt();
	int[] hash=new int[26];
	for(int i=0;i<str.length();i++)
	{
		hash[str.charAt(i)-'a']++;
	}
	while(test>0)
	{
		System.out.println("Enter character= ");
		char c=sc.next().charAt(0);
		System.out.println(hash[c-'a']);
		test--;
	}
}
public static void Upper_Hashing(String str)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter test case= ");
	int test=sc.nextInt();
	int[] hash=new int[26];
	for(int i=0;i<str.length();i++)
	{
		hash[str.charAt(i)-'A']++;
	}
	while(test>0)
	{
		System.out.println("Enter character= ");
		char c=sc.next().charAt(0);
		System.out.println(hash[c-'A']);
		test--;
	}
}
public static void Upper_Lower_Hashing(String str)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter test case= ");
	int test=sc.nextInt();
	int[] hash=new int[256];
	for(int i=0;i<str.length();i++)
	{
		hash[str.charAt(i)]++;
	}
	while(test>0)
	{
		System.out.println("Enter character= ");
		char c=sc.next().charAt(0);
		System.out.println(hash[c]);
		test--;
	}
}
}
