import java.util.*;
class S_CL
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Sum : " + ((Double.parseDouble(args[0])) + (Double.parseDouble(args[1]))));
		int a,b;
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println(a+b);
	}
}