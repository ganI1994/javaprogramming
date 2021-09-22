package numbersystem;

public class sumoffirst_n_primenos 
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
		int sum=0;
		int count=5;
		for(int num=12; num<20 && count>0;num++)
		{
			boolean ans=isprime(num);
			if(ans==true)
			{
				System.out.print(num+" ");
				sum=sum+num;
				count--;
			}
		}
		System.out.println("sum is: "+sum);
	}
}