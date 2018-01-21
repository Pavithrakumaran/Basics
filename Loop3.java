package pavi;

public class Loop3 {

	public static void main(String[] args) {
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
		// TODO Auto-generated method stub

	}

}
