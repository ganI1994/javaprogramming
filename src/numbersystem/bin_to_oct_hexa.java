package numbersystem;

public class bin_to_oct_hexa 
{
public static int binTodec(int num)
{
	int ans=0;
	int temp=1;
	while(num!=0)
	{
		int rem=num%10;
		if(rem>1)
		{
			return-1;
		}
		ans=ans+(rem*temp);
		temp=temp*2;
		num=num/10;
	}
	return ans;
}
public static String decTooct(int ans)
{
	String out="";
	while(ans!=0)
	{
		int rem=ans%8;
		out=rem+out;
		ans=ans/8;
	}
	return out;
}
public static void main(String[] args) {
	int num=101001;
	System.out.println("Number is :"+num);
	int ans=binTodec(num);
	if(ans==-1)
	{
		System.out.println(num+" is not a binary number");
	}
	else
	{
		System.out.println("Decimal number is :"+ans);
	}
	String out=decTooct(ans);
	System.out.println("Ocatal number for binary number "+num+" is "+out);
	
}
}
