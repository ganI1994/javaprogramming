package numbersystem;

public class prime_in_range_of_values 
{
	public static boolean isprime(int num)
	{
		if(num==1)
		{
			return false;
		}
		for(int i=2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
}
	public static void main(String[] args) {
		for(int num=1;num<=100;num++)
		{
			boolean ans=isprime(num);
			if(ans==true)
			{
				System.out.print(num+" ");
			}
		}
		System.out.println("are prime numbers between 1 to 100");
	}
}