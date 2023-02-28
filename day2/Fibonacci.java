package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8, firstNum=0,secNum=1, sum=0;
		System.out.println(firstNum);
		for(int i=1;i<range-1;i++) 
		{
			sum=firstNum + secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
			
		}
			
		
		

	}

}
