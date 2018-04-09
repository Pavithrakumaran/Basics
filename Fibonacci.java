package pavi;

public class Fibo {
     public static void main(String[] args) 
                {
		int a=-1,b=1;
		int c=0;
		for(int i=0;i<5;i++)
		{
		    c=a+b;
	            System.out.println(c);
	            a=b;
		    b=c;
	       }
               }
}

Output:
0
1
2
3
