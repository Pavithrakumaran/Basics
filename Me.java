package sample;
class Ab
{
	void pro()
	{
		System.out.println("s");
	}
	}
public class Me extends Ab{
void know()
{
	super.pro();
	}
	public static void main(String[] args) {
	
    Me b=new Me();
    b.know();
	}

}
