package sample;

class B {
	 B(int c)
	{
		System.out.println(c);
	}
}
public class Venijo extends B
{
 Venijo()
{super(66);
	System.out.println("55");
}
public static void main(String[] args)
{
Venijo a=new Venijo();

}
}