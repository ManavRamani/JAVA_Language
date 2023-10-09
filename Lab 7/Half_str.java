/*
4. Write a program to find length of string and print second half of the string
*/

import java.util.Scanner;
class Half_str{
	public static void main(String[] args) {

		Scanner done=new Scanner(System.in);
		String str;
		float size;
		String name =done.nextLine();
		size = name.length();
		size = size/2;
		System.out.println(size);
	}
}