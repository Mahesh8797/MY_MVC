package Collections_SET;
import java.util.*;

class Student
{
	public int id;
	public String name;
	public String sec;
	public int marks;
	
	Student(int id, String name, String sec, int marks)
	{
		this.id=id;
		this.name=name;
		this.sec=sec;
		this.marks=marks;
	
	}

public String toString()
{
	return "ID : "+id+ " Name : "+ name+ " Section : "+ sec+" Marks : "+marks;
}
	
}
public class Xamples_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> student=new HashSet<Student>();
		Student s1=new Student(100,"Mahe","B",95);
	    Student s2= new Student(101,"yog","C",100);
		Student s3= new Student(102,"aar","A",90);
		student.add(s1);
		student.add(s2);
		student.add(s3);
		for(Student s: student)
		{
		System.out.println("ID : "+s.id+ " Name : "+ s.name+ " Section : "+ s.sec+" Marks : "+s.marks);
	 }
		student.remove(s3);
		System.out.println("AFter removing");
		for(Student s: student)
		{
		System.out.println(s);
	 }
		
		}	

}
