/*
2. Write a program that creates and initializes a four integer element array.
Calculate and display the average of its values.
size =4;
*/
import java.util.Scanner;
class Avg_val{
	public static void main(String[] args) {
		Scanner done=new Scanner(System.in);
		int size=0;
		System.out.print("Enter Size of Array : ");
		size =done.nextInt();
		int num[] = new int[size];
		int sum=0;
		float avg;
		for(int i=0;i<num.length;i++)
		{
			System.out.print("Enter Array Element num["+i+"] : ");
			num[i] = done.nextInt(); 
		}
		for(int i=0;i<size;i++)
		{
			sum=sum+num[i];
		}
		avg=sum/size;
		System.out.println("sum is : "+sum);
		System.out.println("Avg is : "+avg);

		// int num[] = new int[]{1,2,3,4};
		// int sum=0;
		// float avg;
		// for(int i=0;i<num.length;i++)
		// {
		// 	sum=sum+num[i];
		// }
		// avg=sum/num.length;
		// System.out.println("sum is : "+sum);
		// System.out.println("Avg is : "+avg);

	}
}
