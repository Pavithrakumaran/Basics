package pavi;
public class Loop2 {
public static void main(String[] args) 
{
		int i=0;
		while(i<5)
		{
		if(i==2)
			{
			i++;
			continue;
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
3
4
welcome

DESCRIPTION:
           The continue keyword can be used in any of the loop control structures.
           It causes the loop to immediately jump to the next iteration of the loop. 
           In a for loop, the continue keyword causes control to immediately jump to the update statement.

