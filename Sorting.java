package sample;

public abstract class Sorting {
	
	public static void main(String[] args) {
		int a[]= {1,10,2,3};
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				}
			}
		}
		for(int i=0;i<4;i++) 
		{
			System.out.println(a[i]);
	    }
		}
	abstract void display();
	}
   class Desending extends Sorting
   {
	   Desending b=new Desending();
	  
   }
