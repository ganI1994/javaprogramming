package numbersystem;

public class isprime 
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
	int num=20;
	System.out.println("Number is :"+num);
	boolean ans=isprime(num);
	if(ans==true)
	{
		System.out.println(num+" is a prime number");
	}
	else
	{
		System.out.println(num+" is not a prime number");
	}
}
}
