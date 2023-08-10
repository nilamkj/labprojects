package myexample.model;

public class Student {
	int id;
	String name;
	int age;
	
	public Student()
	{
		
	}
	public Student(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public boolean equals(Object obj)
	{
		Student s=(Student)obj;
		return this.id==(s.id) && this.name.equals(s.name) && this.age==(s.age);
	}
	
//	public static void main(String args[])
//	{
//		Student s1=new Student(11,"Ulka",27);
//		Student s2=new Student(12,"Shivani",22);
//		Student s3=new Student(13,"Nilam",28);
//		Student s4=new Student(11,"Ulka",27);
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
//	}
}
	


