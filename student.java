package studentdatabaseapp;
import java.util.Scanner;

public class student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tutionBalance=0;
	private  static int costofcourse=600;
	private static int id=1001;
	
//constructor prompt user to enter student name and year
	public student()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter student first name");
		this.firstName=in.nextLine();
		System.out.println("enter student last name");
		this.lastName=in.nextLine();
		System.out.println("1.freshmore\n 2.sophomore\n 3.junior\n 4.senior\n enter student class level:");
		this.gradeYear=in.nextInt();
		setStudentID();
				System.out.println( firstName+ " " + lastName  +" "+ gradeYear  +" "+studentID);
		
	}
	//generate id
	private  void  setStudentID() {
		id++;
		this.studentID=gradeYear+""+id; 
	}
	//enroll in courses
	public void enroll() {
		//get inside a loop,user hits 0
		do {
		System.out.println("enter course to enroll(Q to quit):");
		Scanner in =new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q")) {
		courses=courses+ "\n" + course;
		tutionBalance=tutionBalance+costofcourse;
		}
		
		else { break;}
		}while(1!=0);
	
	}	

	//view balance
public void viewBalance() {
	System.out.println("your balance is:"+tutionBalance);
}
	//pay tuition
public void payTution() {
	viewBalance();
	System.out.println("enter your payment:$");
	Scanner in =new Scanner(System.in);
	int payment=in.nextInt();
	tutionBalance=tutionBalance-payment;
System.out.println("thank you"+payment);
viewBalance();
}

	//show status
public String toString() {
	return "name:"+firstName+" " +lastName+
			"\ncourses enrolled:"
			+ " " +courses+
			"\nBalance:$"+tutionBalance;
}
}

