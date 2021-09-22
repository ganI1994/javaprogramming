package pyramid;

public class program3
{
public static void main(String[] args) {
	int n=3;
	for(int row=1;row<=n;row++)
	{
		for(int space=1;space<=(n-row);space++)
		{
			System.out.print("  ");
		}
		for(int star=1;star<(2*row);star++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int row=n-1;row>=1;row--)
	{
		for(int space=1;space<=n-row;space++)
		{
			System.out.print("  ");
		}
		for(int star=1;star<(2*row);star++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
