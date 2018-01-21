package pavi;

public class Name1 {

	public static void main(String[] args) {
		char c[]= {'P','A','V','I','T','H','R','A'};
		int n=8;
		for(int i=0;i<n;i++)
		{               
			for(int j=0;j<n;j++)
			{
				if(i==j)
					System.out.print(c[i]+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
