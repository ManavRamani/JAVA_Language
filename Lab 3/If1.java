// Wap positive or not using if :
import java.util.*;
class If1
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		int n1,n2,n3;
		System.out.print("Enter 1st Number : ");
		n1 = done.nextInt();
		System.out.print("Enter 2nd Number : ");
		n2 = done.nextInt();
		n3=n1-n2;
		if(n3>0)
		{
			System.out.println("Positive Number is : " + n1);
		}
		if(n3<0)
		{
			System.out.println("Nagative Number is : " + n1);
		}
		if(n3==0)
		{
			System.out.println("Number is Zero = " + n1);
		}
	}
}