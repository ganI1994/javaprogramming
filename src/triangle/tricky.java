package triangle;

public class tricky 
{
public static void main(String[] args) 
{
	int n=4;
	for(int row=1;row<=n;row++)
	{
		int count=1;
		for(int col=1;col<=n;col++)
		{
			if(row>=col)
			{
			System.out.print(count+++" ");
			}
		}
		System.out.println();
	}
}
}
