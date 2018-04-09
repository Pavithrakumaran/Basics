package pavi;
public class Loop1
{
public static void main(String[] args) 
{
		int i=0;
		while(i<5)
		{
			if(i==2)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("welcome");
		}
}

OUTPUT:
0
1
welcome

Description:
            Break is a keyword in java to terminate a while or do-while or switch satatement.
