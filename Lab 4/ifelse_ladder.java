import java.util.*;
class ifelse_ladder
{
	public static void main(String[] args) {
		Scanner done = new Scanner(System.in);
		System.out.print("Enter 1st Sub : ");
		int s1 = done.nextInt(); 
		if(s1>=0)
		{
			System.out.print("Enter 2nd Sub : ");
			int s2 = done.nextInt(); 
			if(s2>=0)
			{
				System.out.print("Enter 3rd Sub : ");
				int s3 = done.nextInt(); 
				if(s3>=0)
				{
					System.out.print("Enter 4th Sub : ");
					int s4 = done.nextInt(); 
					if(s4>=0)
					{
						System.out.print("Enter 5th Sub : ");
						int s5 = done.nextInt();
						if(s5>=0)
						{
							int total=s1+s2+s3+s4+s5;
							int per = total/5;
							System.out.println("Total Marks : " + total);
							System.out.println("Per : " + per + "%");
							if(60<=per)
							{
								System.out.println("First Division....");
							}
							else if(50<=per && 59>=per)
							{
								System.out.println("Second Division....");
							}
							else if(40<=per && 49>=per)
							{
								System.out.println("Third Division....");
							}
							else{
								System.out.println("Fail......");
							}
						}else{System.out.println("Sorry You Can not Enter Nagative Value plzz Retry..!!");}															
					}else{System.out.println("Sorry You Can not Enter Nagative Value plzz Retry..!!");}
				}else{System.out.println("Sorry You Can not Enter Nagative Value plzz Retry..!!");}
			}else{System.out.println("Sorry You Can not Enter Nagative Value plzz Retry..!!");}	
		}else{System.out.println("Sorry You Can not Enter Nagative Value plzz Retry..!!");}
	}
}