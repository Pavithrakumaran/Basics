package pavi;
public class Logical {
public static void main(String[] args)
{
int a=5,b=6,c=1;
System.out.println("the output is:"+(a++ + b--)*(c-- - a--));
}
}

Output:
the output is: -44
