/*
4. Write a program to find length of string and print second half of the string
*/

import java.util.Scanner;
class Half_str{
	public static void main(String[] args) {

		Scanner done=new Scanner(System.in);
		int size;
		String name;
		name =done.nextLine();
		size = name.length();
		for(int i=size/2;i<size;i++)
		{
			System.out.print((char)(name.charAt(i)));
		}
	}
}