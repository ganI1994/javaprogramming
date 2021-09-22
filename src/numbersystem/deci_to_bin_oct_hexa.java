package numbersystem;

public class deci_to_bin_oct_hexa 
{
	public static String decitobin(int a)
	{
		String out="";
		while(a!=0)
		{
			int rem=a%2;
			out=rem+out;
			a=a/2;
		}
		return out;
	}
	public static String deciTooct (int a)
	{
		String out="";
		while(a!=0)
		{
			int rem=a%8;
			out=rem+out;
			a=a/8;
		}
		return out;
	}
	public static String decTohexa(int a)
	{
		String out="";
		while(a!=0)
		{
			int rem=a%16;
			switch (rem) 
			{
			case 10:out='A'+out;
			break;
			case 11:out='B'+out;
			break;
			case 12:out='C'+out;
			break;
			case 13:out='D'+out;
			break;
			case 14: out='E'+out;
			break;
			case 15: out='F'+out;
			break;
			default: out=rem+out;
			break;
			}
			a=a/16;	
		}
		return out;
	}
	public static void main(String[] args) {
		String res1=decitobin(41);
		System.out.println(res1);
		String res2=deciTooct(41);
		System.out.println(res2);
		String res3=decTohexa(83);
		System.out.println(res3);
	}
}
