// Wap positive or not using if :
import java.util.*;
class If
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		int n1;
		System.out.print("Enter Number : ");
		n1 = done.nextInt();
		if(n1>0)
		{
			System.out.println("Positive Number is : " + n1);
		}
		if(n1<0)
		{
			System.out.println("Nagative Number is : " + n1);
		}
		if(n1==0)
		{
			System.out.println("Number is Zero = " + n1);
		}
	}
}