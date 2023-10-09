import java.util.*;
class Pele_num{
	public static void main(String[] args) {
		Scanner done=new Scanner(System.in);
		System.out.print("Enter Any Number : ");
		int num = done.nextInt();
		int t=num;
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

		if(num==r)
		{
			System.out.println("Pelindrom Number is : "+num);
		}
		else{
			System.out.println("Not Pelindrom Number : "+num);
		}
	}
}