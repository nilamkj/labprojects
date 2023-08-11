package myexample.main;

import java.util.Scanner;

import myexample.model.Student;

public class StudentMain {

	static Student[] sArray=new Student[15];
	static Student stud=new Student();
	static StudentMain studMain=new StudentMain();
	static int countStud=0;
	
	Scanner sc=new Scanner(System.in);
	String name;
	int id,age;
	
	public  void addStudent()
	{
		System.out.println("Enter Student id: ");
		id=sc.nextInt();
		System.out.println("Enter Student name: ");
		name=sc.next();
		System.out.println("Enter Student age: ");
		age=sc.nextInt();
		 
		Student sInput=new Student(id,name,age);
		
		if(!studMain.checkStudentRecord(sInput))
		{
			sArray[countStud]=sInput;
			countStud++;
		}else
		{
			System.out.println("Student record already exist");
		}
	}
	public boolean checkStudentRecord(Student sInput)
	{
		boolean b=false;
		for(Student s:sArray)
		{
			if(s!=null)
			{
				if(s.equals(sInput))
				{
					b=true;
					break;
				}
			}
		}
		return b;
	}
	
	public void display()
	{
		for(Student s:sArray)
		{
			if(s!=null)
			{
				System.out.println(s);
			}
		}
		System.out.println();
	}
	public static void main(String ags[])
	{
		Scanner sc=new Scanner(System.in);
		boolean access=true;
		
		do
		{
			System.out.println("\n1.Add Student \n2.Display all student \n3.exit");
			System.out.println("Enter choice: ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: studMain.addStudent();
					break;
					
			case 2: studMain.display();
					break;
					
			case 3: access=false;
					break;
			}
			
		}while(access);
	}
}
