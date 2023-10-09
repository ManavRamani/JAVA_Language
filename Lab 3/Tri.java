import java.util.*;
class Tri
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		int a,b,c,sum;
		System.out.println("1st : ");
		a=done.nextInt();
		System.out.println("2nd : ");
		b=done.nextInt();
		System.out.println("3rd : ");
		c=done.nextInt();
		sum=a+b+c;
		if(180==sum)
		{
			System.out.println("perfact Triagle ");
		}
		else{
			System.out.println("Not Triagle ");
		}
	
		
	}
}