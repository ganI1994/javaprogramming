package numbersystem;

public class Isperfect 
{
public static  boolean isperfect(int num)
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
	int num=28;
	System.out.println("Number is :"+num);
	boolean ans=isperfect(num);
	if(ans==true)
	{
		System.out.println(num+" is a perfect number");
	}
	else
	{
		System.out.println(num+" is not a perfect number");
	}
}
}
