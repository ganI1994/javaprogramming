package triangle;

public class tricky4 
{
public static void main(String[] args) 
{
int n=4;
for(int row=1;row<=n;row++)
{
	int temp=row;
	int temp2=n-1;
	for(int col=1; col<=row;col++)
	{
		System.out.print(temp +" ");
		temp=temp+temp2--;
	}
	System.out.println();
}
}
}
