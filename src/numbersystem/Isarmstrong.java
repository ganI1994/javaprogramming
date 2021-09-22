package numbersystem;

public class Isarmstrong
{
public static int noofdigits(int num)
{
	int count=0;
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	return count;
}
public static int power(int a,int p)
{
int out=1;
for(int i=1;i<=p;i++)
{
	out=out*a;
}
return out;
}
public static boolean isarmstrong(int num)
{
int temp=num;
int res=0;
int pwr=noofdigits(num);
while(num!=0)
{
int rem=num%10;
res=res+power(rem,pwr);
num=num/10;
}
return(temp==res);
}
public static void main(String[] args) {
	int count=5;
	int sum=0;
	for(int num=10;num<=10000 && count>0;num++)
	{
	boolean ans=isarmstrong(num);
	if(ans==true)
	{
		System.out.println(num+" is armstrong number");
		sum=sum+num;
		count--;
	}
	}
	System.out.println(sum+" is the sum of 5 armstrong numbers in the given range");
}
}
