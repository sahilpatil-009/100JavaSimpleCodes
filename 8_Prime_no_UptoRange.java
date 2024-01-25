/*
Find all the Prime Numbers in a Given Interval in Java
Given two integer inputs for the range or the interval for the search. The objective is to search and find all the Prime Numbers that lay in the given interval or range. To do so we’ll iterate through the numbers and check whether or not they are prime simultaneously. We’ll use loops to check whether the number has any factors other than 1 and the number itself. Here are few methods we’ll use to Find all the Prime Number in a Given Interval in Java Language.

Method 1: Using inner loop Range as [2, number-1].
Method 2: Using inner loop Range as [2, number/2].
Method 3: Using inner loop Range as [2, sqrt(number)].
Method 4: Using inner loop Range as [3, sqrt(number), 2].*/

import java.util.*;

class PrimeUpToRange{
	
	int num;
	PrimeUpToRange(int n){
		this.num = n;
	}
	
	public void MyMethod(){
		
		int count=0;
		int res=0;
		if(num < 2){
			
			System.out.println("No Prime Number Found");
			
		}else{
			
			for(int i=3;i<num;i++)
			{
				for(int j=2;j<i;j++)
				{
					//res = i%j !=0 ? i:i++;
					if(i%j != 0)
					{
						res = i;
					}
					else
					{
						i++; //this executes Outer Loop
					}
					//count++;
				}
				
				System.out.println("Prime="+res);
				//System.out.println("Count="+count);
			}
		}
	}
	
	public void Another_Method(){
		
		System.out.println("Anotehr Method");
		if(num<2){
			System.out.println("No Prime Number Found !");
		}
		else{
			for(int i=3;i<=num;i++)
			{
				if(isPrime(i)){
					System.out.println("Prime="+i);
				}
			}
		}
	}
	
	public Boolean isPrime(int n){
		
		for(int j=2;j<n;j++){
			
			if(n % j == 0){
				return false;
			}
		}
		
		return true;
	}
	
}

class PrimeUpToRange_test{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		PrimeUpToRange r1 = new PrimeUpToRange(num);
					   r1.MyMethod();
					   r1.Another_Method();
	}
}