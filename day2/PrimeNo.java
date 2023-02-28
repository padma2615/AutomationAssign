package week1.day2;
public class PrimeNo 
{
	
	public static void main(String[] args)
	{
		int num=13;
		
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if((num%i)==0)
			{
			  flag=true;	
			}
		}
		if(flag==true)
		{
			System.out.println("the number is not a prime");
		}
		else
			
		{
			System.out.println("The number is prime");
		}
			
	}

}

