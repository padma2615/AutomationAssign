package week1.day2;

public class Palindrome {
public static void main(String[] args) {
	int num=34346;
	int n=num,sum=0;
	while(num!=0)
	{
		int rem=num%10;
		sum=sum*10+rem;
		num=num/10;
		
	}
	if(num==sum)
	{
		System.out.println("It is a palindrome");
		
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	
}
}
