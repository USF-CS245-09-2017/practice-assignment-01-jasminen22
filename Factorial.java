// 4! = 4*3*2*1
public class Factorial 
{
	public int factorial(int n, String type)
	{
		if(type.equals("iterative"))
		{
			return factorial_iterative(n);
		}
		else if(type.equals("recursive"))
		{
			return factorial_recursive(n);
		}
		return 0;
	}
	public int factorial_recursive(int n)
	{
		if(n==1)
			return 1;
		return n*factorial_recursive(n-1);
	}
	public int factorial_iterative(int n)
	{
		int f=1;
		for(int i=n; i>0; i--)
		{
			f = i*f;
		}
		return f;
	}
}