package day1;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("enter num");
		num=sc.nextInt();
		int f=calculateFactorial(num);
		System.out.println(f);
	
		// TODO Auto-generated method stub

	}
	public static int calculateFactorial(int num)
	{
		int i,fact=1;
		for( i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
		
		
	}

}
