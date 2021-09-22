package triangle;

public class squarepatterntricky
{
public static void main(String[] args) 
{
/*System.out.println('a'+'b');//195
System.out.println("a"+"b");
System.out.println(a+b); will treat as variables*/
	int n=5;
	int count=1;
	for(int row=1; row<=n; row++)
	{
		for(int col=1;col<=n;col++)
		{
			System.out.print(count+++" ");
		}
		if(row<=2)
		{
			count=count+5;
		}
		else if(row==3)
		{
			count=count-10;
		}
		else
		{
			count=count-15;
		}
		System.out.println();
	}
}
}
