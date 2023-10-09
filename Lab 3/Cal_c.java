import java.util.*;
class Cal_c
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		float c ,f;
		System.out.print("Enter f : ");
		f =done.nextFloat();
		c = f - 32 *5 /9;
		System.out.println("cal c : " + c);
		
	}
}