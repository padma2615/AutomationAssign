package week1.day1;

public class Student {
	public void report()
	{
	String studentName="Sara";
	int rollNo=10;
	String collegeName="SSEC";
	int markScored=90;
	float cgpa=9.5f;
	System.out.println("Studentname:"+studentName);
	System.out.println("RollNo:"+rollNo);
	System.out.println("Collegename:"+collegeName);
	System.out.println("Markscored:"+markScored);
	System.out.println("cgpa:"+cgpa);
}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.report();
		
		
		
	}
	
	

}
