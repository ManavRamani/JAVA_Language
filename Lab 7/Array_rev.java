/*
	3. Write a program to print given array in reverse order.
*/
import java.util.Scanner;
class Array_rev{
	public static void main(String[] args) {
		Scanner done=new Scanner(System.in);
		int size= done.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter Array Element arr["+i+"] : ");
			arr[i] = done.nextInt(); 
		}
		for(int i=size-1;i>=0;i--)
		{
			System.out.println("arr in reverse : arr["+i+"] : "+arr[i]);
		}
	}	
}
