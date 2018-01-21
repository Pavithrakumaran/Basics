package pavi;

public class Logical4 {public static void main(String[] args) {
	int a=5,b=10,c=20,d=2,e=5;
	boolean f=a>b;
	boolean g=((b>=c)||(d>=e));
	boolean h=f && g;
	System.out.println("the output is:"+h);
}

}
