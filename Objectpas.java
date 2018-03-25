package sample;

public class Objectpas {
	int k=5;
	public static void main(String[] args) {
		Objectpas a=new Objectpas();
		dowork(a);
		System.out.println(a.k);
	}
    static Objectpas dowork(Objectpas newObj)
    {
    	newObj.k=10;
    	return new Objectpas();
    }
}
