package sample;

public  class Inter  {
  int a=10;

 void add()
{   final int a=10; 
a=22;
	int c=a+10;
	System.out.println(c);
}
	public static void main(String[] args) {
	Inter b=new Inter();
	b.add();
	}

}

