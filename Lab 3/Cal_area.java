import java.util.*;
class Cal_area
{
	public static void main(String[] args)
	{
		Scanner done = new Scanner(System.in);
		float PI=3.14f ,area ,r;
		r =done.nextFloat();
		area = PI*r*r;
		System.out.println("cal Area is : " + area);
	}
}