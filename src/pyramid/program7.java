package pyramid;

public class program7
{
	public static void main(String[] args) {
		int n=4;
		//int count=n*n;
		for(int row=n;row>=1;row--)
		{
			int count=n*2-1;
			for(int space=1; space<=n-row;space++)
			{
				System.out.print("  ");
			}
			for(int num=1; num<(2*row); num++)
			{
				System.out.print(count--+" ");
			}
			System.out.println();
		}
	}
}
