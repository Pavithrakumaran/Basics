package sample;

public class Thiss {
    int a=10;
    void get()
    {int a=88;
	System.out.println(a);
    	System.out.println(this.a);
    }
	public static void main(String[] args) {
		Thiss c=new Thiss();
		c.get();
	}
	
}
