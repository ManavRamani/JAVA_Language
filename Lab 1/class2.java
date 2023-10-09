// 2 Class Create in 1 file :
	// How to access Other class method in 1st class :
// Output :->	
class class2
{
	
	public static void main(String args[])
	{
		b1 done = new b1();
		System.out.println("Class Method 1....");
		done.main();
	}
	
	
}
class b1
{
	public void main()
	{
		System.out.println("Class Method 2....");
	}
}