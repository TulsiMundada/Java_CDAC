package day6;

public class DemoNumLambda {
	
	public static boolean verifyNumber(NumberFunc func,int n)
	{
		return func.checkNumber(n);
	}

	public static void main(String[] args) {
		NumberFunc ispositive = (n) -> n >=0;
		
		if(ispositive.checkNumber(10))
			System.out.println("No is positive");
		
		NumberFunc isprime = (n) ->
		{
			for(int i=2; i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		};
		
		System.out.println(isprime.checkNumber(12));
		
		System.out.println(verifyNumber((n) -> n%2==0, 10));
		
		System.out.println(verifyNumber((n) ->
		{
			for(int i=2; i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}, 10));
		
		verifyNumber(Math::isPrime, 20);

	}

}
