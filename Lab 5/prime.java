import java.util.*;
class prime{
	public static void main(String[] args) {
		Scanner done = new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num=done.nextInt();
		boolean right=false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				right=false;
				System.out.println("Not Prime..");
				break;
			}
			else{
				right=true;
			}
		}
		if(right)
		{
			System.out.println("Prime Number");
		}
	}
}