import java.util.*;
class week_day
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		int day;
		System.out.print("Enter Number (1-7) : ");
		day = done.nextInt();
		if(1==day)
		{
			System.out.println("Mon...");
		}
		else if(2==day)
		{
			System.out.println("Tue...");
		}
		else if(3==day)
		{
			System.out.println("Wen...");
		}
		else if(4==day)
		{
			System.out.println("thur...");
		}
		else if(5==day)
		{
			System.out.println("Fri...");
		}
		else if(6==day)
		{
			System.out.println("Sat...");
		}
		else if(7==day)
		{
			System.out.println("Sun...");
		}
		else{
			System.out.println("Wrong Input.... ");
		}
		
	}
}