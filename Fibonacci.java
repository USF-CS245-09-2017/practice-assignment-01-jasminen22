// f(n)=f(n-1)+f(n-2)
// F = 0,1,1,2,3,5,8,..
public class Fibonacci 
{
	public int fibonacci (int n, String type)
	{
		if(type.equals("iterative"))
		{
			return fibonacci_iterative(n);
		}
		else if(type.equals("recursive"))
		{
			return fibonacci_recursive(n);
		}
		return 0;
	}

	public int fibonacci_recursive(int n)
	{
		if(n==0 || n==1)
			return n;
		return fibonacci_recursive(n-1)+fibonacci_recursive(n-2);
	}
	public int fibonacci_iterative(int n)
	{

		int f=1;
		int x = 1;
		int y = 1;
		if(n==0 || n==1)
			return n;		
		for(int i=2; i<n; i++)
		{
			y = f;
			f = f+ x;
			x = y;
		}
		return f;
	}
}