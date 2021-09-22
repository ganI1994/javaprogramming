package numbersystem;

public class bin_to_deci 
{
public static int binTodec(int num)
{
	int out=0;
	int temp=1;
	while(num!=0)
	{
		int rem=num%10;
		if(rem>1)
		{
			return -1;
		}
		out=out+(rem*temp);
		temp=temp*2;
		num=num/10;
	}
	return out;
}
public static void main(String[] args) 
{
	int num=101001;
	System.out.println("Binary number is :"+num);
	int ans=binTodec(num);
	if(ans!=-1)
	{
		System.out.println("Decimal number is :"+ans);
	}
	else
	{
		System.out.println(num+" not a binary number");
	}
}
}
