package day1;

import java.util.*;

public class Markvalidator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                                                          
		System.out.println("enter marks");
		int marks= sc.nextInt();
		boolean b=isPass(marks);
		System.out.println(b);
		 char c=markgrade(marks);
		System.out.println(c);
		
	}
	
	public static boolean  isPass(int marks) {
		if(marks>=40) {
			return true;
		}
	
	return false;
	}
	public static char markgrade(int marks) {
		if(isPass(0))
		{
			 return 'f' ;
		}
			else {
			if(marks>90)
			{
			return 'A';
			}
			else if(marks>75)
			{
				//System.out.println("B");
				return 'B';
			}
			else if(marks>60)
			{
				//System.out.println("C");
				return 'C';
				
			}
			else
			{
				//System.out.println("D");
				return 'D';
			}
			}
			
		}
	

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);                                                          
		System.out.println("enter marks");
		int marks= sc.nextInt();
		boolean b=sc.isPass(marks);
		sc.markrade(marks);*/
		
		
		
		
	
		// TODO Auto-generated method stub

	}

