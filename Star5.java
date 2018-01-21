package pavi;

public class Star5 {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0 || i==n-1) && j==n/2)
					System.out.print("*");
				if((i==1 || i==n-2) && (j==1 || j==n-3))
				    System.out.print("*");
				if(i==2 && (j==0 || j==n-1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
