package pyramid;

public class program8 
{
public static void main(String[] args) {
	int n=3;
	for(int row=1;row<=n;row++)
	{
		int count=1;
		for(int space=1;space<=n-row;space++)
		{
			System.out.print("  ");
		}
		for(int num=1; num<2*row;num++)
		{
			if(row>num)
			{
				System.out.print(count+++" ");
			}
			else
			{
				System.out.print(count--+" ");
			}
		}
		System.out.println();
	}
	for(int row=n-1;row>=1;row--)
	{
		int count=1;
		for(int space=1;space<=n-row;space++)
		{
			System.out.print("  ");
		}
		for(int num=1; num<2*row;num++)
		{
			if(row>num)
			{
				System.out.print(count+++" ");
			}
			else
			{
				System.out.print(count--+" ");
			}
		}
		System.out.println();
	}
}
}
