package pyramid;

public class program2 
{
public static void main(String[] args) {
	int n=3;
	for(int row=n;row>=1;row--)
	{
		for(int space=1; space<=(n-row);space++)
		{
			System.out.print("  ");
		}
		for(int star=1; (2*row)>star;star++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
