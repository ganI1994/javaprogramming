package recursion;

public class program1
{
public static void demo1(int a)
{
	if(a>=1)
		{System.out.print(a+" ");
	a--;
	demo1(a);
		}
}
public static void demo2(int a)
{
	if(a<=9)
		{System.out.print(a+" ");
	a++;
	demo2(a);
		}
}
public static void main(String[] args) {
	demo1(9);
	demo2(2);
}
}
