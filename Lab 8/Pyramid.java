/*
6. Write an interactive program to print a string entered in a pyramid form.
For instance, the string "stream" has to be displayed as follows:
		s
	   s t
	  s t r
	 s t r e
	s t r e a
   s t r e a m
*/
import java.util.Scanner;
class Pyramid{
	public static void main(String[] args) {
		Scanner done = new Scanner(System.in);

		System.out.print("Enter Any Word : ");
		String name = done.nextLine();
		int n=name.length();
		for(int i=0;i<n;i++)
		{
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				char ch=(char)(name.charAt(j));
				System.out.print(" "+ch);
			}
			System.out.println(" ");
		}
	}
}