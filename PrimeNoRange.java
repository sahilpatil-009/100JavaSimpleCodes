//Prime Number till Range;

import java.util.*;
class PrimeRange{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer>p = new LinkedList<Integer>();
		
		System.out.println("Enter No");
		int n = sc.nextInt();
		
		int count=0;
		if(n==0)
		{
			System.out.println(n+" is not Prime !");
			return;
		}
		else
		{	
		  for (int i = 1; i <= n; i++) 
		  {
			 count = 0;
			   for (int j = 2; j <= i / 2; j++) 
			   {
					if (i % j == 0)
					{
						count++;
						break;
					}
			   }
			   if (count == 0)
			   {
					System.out.println(i);
			   }
		  }
		  
		}
	}
}