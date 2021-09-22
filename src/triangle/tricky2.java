package triangle;

public class tricky2 
{
public static void main(String[] args) 
{
	int n=4;
	char ch1='A';
	char ch2='a';
	for(int row=1; row<=n;row++)
	{
		for(int col=1;col<=n;col++)
		{
			if(col>=row)
			{
			System.out.print(ch1+++""+ch2+++" ");
			}
			else
			{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
}
}
