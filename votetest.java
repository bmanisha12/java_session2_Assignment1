import java.util.Scanner;


public class votetest {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int age;
		
		System.out.print("\n enter ur age : ");
		age = s.nextInt();
		
		if (age>0)
		{
			
		if(age>=18)
			System.out.println("You are eligible for Voting");
		else
			System.out.println("You are not eligible for Voting");
		
		}
		else
			System.out.println("Alert: Age should be positive!");
	}

}
