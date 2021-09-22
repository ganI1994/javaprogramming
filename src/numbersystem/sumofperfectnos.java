package numbersystem;

public class sumofperfectnos 
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
	int count=5;
	int sum=0;
	for(int num=1;num<=1000000 && count>0;num++)
	{
		boolean ans=isperfect(num);
		if(ans==true)
		{
			System.out.println(num);
			sum=sum+num;
			count--;
		}
	}
	System.out.println(sum+" is the sum of first 5 perfect numbers");
}
}
