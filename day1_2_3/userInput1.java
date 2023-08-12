// User pase thi Roll Number & Name :-
import java.util.*;
class userInput1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Your Roll Number : ");
		int rollNum = scan.nextInt();
		System.out.print("Enter Your Name : ");
		String name = scan.next();
		System.out.println("My Roll Number is : " + rollNum + " And My Name is : " + name);
	}
}