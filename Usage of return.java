package pavi;
public class Loop3
{
public static void main(String[] args) 
{
		int i=0;
		while(i<5)
		{
			if(i==3)
			{ 
				i++;
				return;
			}
		System.out.println(i);
		i++;
		}
		System.out.println("welcome");
		}
}

OUTPUT:
0
1
2

DESCRIPTION:
	It is used to exit from a method, with or without a value.
