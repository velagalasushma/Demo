package programs;

import java.util.Scanner;

public class Ibm {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any email:");
		String email=sc.next();
		
		System.out.print("Enter any user name:");
		
		String name=sc.next();
		if(email.contains("ibm"))
		{
			System.out.println("user name:" +name);
		}
		else
		{
			System.out.println("He is not in IBM Company");
		}
		
		
	}

}
