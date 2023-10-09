import java.util.*;
class RangePrime{
	public static void main(String[] args) {
		Scanner done = new Scanner(System.in);
		System.out.print("Enter Starting Point : ");
		int s=done.nextInt();
		System.out.print("Enter Endding Point : ");
		int e=done.nextInt();
		for(int i=s;i<=e;i++)
		{	
			boolean right=false;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					right=false;
					break;
				}
				else{
					right=true;
				}
			}
			if(right)
			{
				System.out.println("Prime Number : "+i);
			}
			// else{
			// 	System.out.println("Not Prime : "+i);
			// }
		}
	}
}