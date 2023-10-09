import java.util.*;
class Cal
{
	public static void main(String[] args)
	{
		double n1,n2,ans,ch;
		Scanner done = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		n1 = done.nextDouble();
		System.out.print("Enter 2nd Number : ");
		n2 = done.nextDouble();
		System.out.print("Enter 1 for \'+\'");
		System.out.print("Enter 2 for \'-\'");
		System.out.print("Enter 3 for \'*\'");
		System.out.print("Enter 4 for \'/\'");
		System.out.print("Enter 5 for \'%\'");
		System.out.print("Enter 0 for \'Exit\' : ");
		System.out.print("Enter Your Choich : ");
		ch = done.nextDouble();
		switch(ch)
		{
			case 1:
					System.out.println("Sum is : " + (n1+n2));
					break;
			case 2:
					System.out.println("Sub is : " + (n1-n2));
					break;
			case 3:
					System.out.println("Mul is : " + (n1*n2));
					break;
			case 4:
					System.out.println("Div is : " + (n1/n2));
					break;
			case 5:
					System.out.println("Mod is : " + (n1%n2));
					break;
			case 0:
					System.out.println("Thank You.... ");
					break;
			defualt:
					System.out.println("Wrong Choich....");
					break;
		}
	}
}