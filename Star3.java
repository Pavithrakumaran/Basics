package pavi;

public class Star3
{

	public static void main(String[] args) 
	{
		int i, j, n=6;
		for(i=0;i<n;i++)
		{
			if(i==0 || i==n-1)
			{
				for(j=0;j<n;j++)
					System.out.print("* ");
				System.out.println();
			}
			if(i>=1 && i<=n-2)
			{
			     for(j=0;j<n;j++)	
			     {
			    	 if(j==0 || j==n-1)
			    		 System.out.print("* ");
			    	 else
			    		 System.out.print("  ");
			     }
			     System.out.println();
			}
			
		}

	}

}
