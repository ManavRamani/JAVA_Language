import java.util.*;
class big
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a Value : ");
		a = done.nextInt();
		System.out.print("Enter b Value : ");
		b = done.nextInt();
		System.out.print("Enter c Value : ");
		c = done.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Big : " + a);				
			}
			else{
				System.out.println("C is Big : " + c);
			}
		}
		else{
			if(b>c)
			{
				System.out.println("B is Big : " + b);
			}
			else{
				System.out.println("C is Big : " + c);
			}
		}
		
	}
}