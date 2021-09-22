package pyramid;

public class program5 
{
public static void main(String[] args) {
	int n=3;
	int count=1;
	for(int row=1;row<=n;row++)
	{
		for(int space=1; space<=n-row;space++)
		{
			System.out.print("  ");
		}
		for(int num=1; num<(2*row); num++)
		{
			System.out.print(count+++" ");
		}
		System.out.println();
	}
}
}
