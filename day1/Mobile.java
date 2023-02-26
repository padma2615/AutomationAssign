package week1.day1;

public class Mobile {
	
	public void makecall()
	{
		String mobileModel="1+";
		float mobileWeight=100f;
		System.out.println("Model:"+mobileModel);
		System.out.println("Weight:"+mobileWeight);
		System.out.println("Make a call");
		
	}
	public void sendMsg()
	{
		boolean isFullCharged= true;
		int mobileCost=20000;
		System.out.println("Send a Message");
		System.out.println("Is Full Charge:"+isFullCharged);
		System.out.println("Cost:"+mobileCost);
	}

	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile mob=new Mobile();
		mob.makecall();
		mob.sendMsg();
		
		// TODO Auto-generated method stub

	}

}

