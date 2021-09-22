package numbersystem;

public class oct_to_dec 
{
public static int octTodec(int num)
{
	int out=0;
	int temp=1;
	while(num!=0)
	{
		int rem=num%10;
		if(rem>7)
		{
			return 0;
		}
		out=out+(rem*temp);
		temp=temp*8;
		num=num/10;
	}
	return out;
}
public static void main(String[] args) {
	int num=48;
	System.out.println("Number is :"+num);
	int ans = octTodec(num);
	if(ans==0)
	{
		System.out.println(num+" is not a octal number");
	}
	else
	{
		System.out.println("Decimal number for octal number "+num+" is "+ans);
	}
}
}
