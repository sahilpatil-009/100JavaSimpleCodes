
import java.util.*;

class Prime{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no:");
		int n = sc.nextInt();
		
		if(n == 0 || n == 1)
		{
			System.out.println(n+" is Not Prime !");
			return;
		}
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i == 0)
				{
					System.out.println(n+" is Not Prime !");
					return;
				}
			}
		}
		
		System.out.println(n+" is Prime");
	}
}