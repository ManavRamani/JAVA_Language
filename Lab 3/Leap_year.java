// Wap Leap Year Or Not :
import java.util.*;
class Leap_year
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		int year;
		System.out.print("Enter Year : ");
		year = done.nextInt();
	
		if(year%4==0)
		{
			System.out.println("Leap Year : " + year);
		}
		else{
			System.out.println("Not Leap Year : " + year);
		}
		
	}
}