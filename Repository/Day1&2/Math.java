package day2;

public class Math {

	public static int add(int n1, int n2)
	{
		return n1+n2;
	}
	
	public static int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	
	public static float add(int n1, float n2)
	{
		return n1+n2;
	}
	
	public static float add(float n1, int n2)
	{
		return n1+n2;
	}
	
	public static int addition(int...num)
	{
		int sum=0;
		for(int i=0; i<num.length;i++)
		{
			sum+=num[i];
		}
		return sum;
	}
	
	public static void swap(int a, int b)
	{
		int temp =a;
		a = b;
		b = temp;
	}
	
	public static void swap(int[]a)
	{
		int temp =a[0];
		a[0]= a[1];
		a[1] = temp;
	}
	
	
}
