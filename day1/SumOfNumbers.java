package day1;
import java.util.*;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,sum,start,end;
		System.out.println("enter start");
		 start=sc.nextInt();
		 System.out.println("enter end");
		end=sc.nextInt();
		int s=sumOfEvenNumbers( start, end);
		System.out.println(s);
		 int p=sumOfOddNumbers(start,end);
		 System.out.println(p);
		 
		 
	
		
		
		// TODO Auto-generated method stub

	}
	
	public static int sumOfEvenNumbers(int start,int end)
	{
		int sum=0;
		for(int i=0;i<=end;i=i+2)
		{
			sum=sum+i;
			//return sum;
			
		}
		return sum;
		
	}
	
	public static int sumOfOddNumbers(int start,int end)
	{
		int i = start,sum=0;
		for( i=start;i<=end;i++)
		if(i%2!=0)
		{
			sum=sum+i;
		}
		return sum;
	}

}
