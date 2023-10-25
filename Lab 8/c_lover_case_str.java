/*
5. Write an application that searches through its command-line argument.
If an argument is found that does not begin with and upper case letter,
display error message and terminate.
*/

class C_lover_case_str{
	public static void main(String[] args) {
		String str = args[0];
		char ch =(str.charAt(0));
		if(ch>=65 && ch<=90)
		{
			System.out.println("Pliz Enter First Latter in Lover Case.....");
		}else{
			System.out.println("Name : " + str);
		}
	}
}