package triangle;

public class tricky3 
{
public static void main(String[] args) 
{
	int n=4;
	int count=1;
	int temp=2;
	for(int row=1;row<=n;row++)
	{
		for(int col=1;row>=col;col++)
		{
			System.out.print(count-- +" ");
		}
		count=count+row+temp++;
		System.out.println();
	}
}
}
