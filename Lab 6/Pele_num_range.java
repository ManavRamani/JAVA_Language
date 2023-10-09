import java.util.*;
class Pele_num_range{
	public static void main(String[] args) {
		Scanner done=new Scanner(System.in);
		System.out.print("Enter Starting Number : ");
		int s_num = done.nextInt();
		System.out.print("Enter Endding Number : ");
		int e_num = done.nextInt();
		// int s_num=1;
		// int e_num=10;
		for(int i=s_num;i<=e_num;i++)
		{
			int t=i;
			int l,r=0;
			while(t>0)
			{
				l=t%10;
				// System.out.println("l :"+l);
				r=(r*10)+l;
				// System.out.println("r :"+r);
				t=t/10;
				// System.out.println("t :"+t);
			}

			if(i==r)
			{
				System.out.println("Pelindrom Number is : "+i);
				System.out.println("--------------------------------");
			}
			// else{
			// 	System.out.println("Not Pelindrom..."+i);
			// }
		}
	}
}