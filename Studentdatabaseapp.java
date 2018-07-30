package studentdatabaseapp;

import java.util.Scanner;

public class Studentdatabaseapp {
public static void main(String[] args) {
	
		student stu1=new student();
		stu1.enroll();
		stu1.payTution();
		System.out.println(stu1.toString());
	
	//ask how many new users we want to add
System.out.println("enter no of students");
Scanner in=new Scanner(System.in);
int numofstudents=in.nextInt();
student[] students=new student[numofstudents];

	//create a number of new students
for(int n=0;n<numofstudents;n++) {
	students[n]=new student();
	students[n].enroll();
	students[n].payTution();
	System.out.println(students[n].toString());
	
}
}
}















