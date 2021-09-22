package numbersystem;

public class Perfect_no_in_range
{
public static boolean isperfect(int num)
{
	int sum=0;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			sum=sum+i;
		}
	}
	return (sum==num);
}
public static void main(String[] args) {
	for(int num=1; num<=1000;num++)
	{
		boolean ans=isperfect(num);
		if(ans==true)
		{
			System.out.println(num);
		}
	}
	System.out.println(" are perfect numbers");
}
}
