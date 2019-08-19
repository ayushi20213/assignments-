package day1;
import java.util.*;

public class Marksswitch {

	private static final String A = null;
	private static final String B = null;
	public static void main(String[] args) {
		int marks;
		System.out.println("enter marks");
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		//if(marks>90)
		//{
			
		//}
			
		String s=markGrade(marks);
		System.out.println(s);
		
		//Switch(marks)
	
		// TODO Auto-generated method stub

	}
	public static String markGrade(int marks)
	{
		String grade =" ";
		
	switch(grade)
		{
	case "a":
		if(marks>90)
		grade="A";
		//break;
		else if((marks>=75) && (marks<=90))
			grade="B";
		 
		 else if((marks>=60)&& (marks<75))
		 grade="C";
		// break;
		 
	
		
	default:
		grade= "D";
		//break;
		}
	return grade;
	}
}
	
			
      
				
				
				





