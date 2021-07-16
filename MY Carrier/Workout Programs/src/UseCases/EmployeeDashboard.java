package UseCases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class MaheException extends Exception
{

	
	public MaheException(String string)
	{
		super(string);
	}
	
}
class Employee
{
	 String name;
	 int empID;
	 int Salary;
	public Employee(String name, int empID, int Salary) {
		this.name = name;
		this.empID = empID;
		this.Salary = Salary;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", Salary=" + Salary + "]";
	}	
		
	public static void check(int sal) throws IOException
	{
		try
		{
				
		if(sal<29900)
		{
			throw new MaheException("Invalid employee details");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
public class EmployeeDashboard extends Employee {
	
	static int Salary;
	public EmployeeDashboard(String name, int empID, int salary)
	{
		super(name, empID, salary);
		
	}
	public static void call(String line)
	{
		Scanner scan=new Scanner(line);
		scan.useDelimiter("\\s*,\\s*");
		String name=scan.next();
		int empID=scan.nextInt();
		int salary=scan.nextInt();
		Employee emp=new Employee(name,empID,salary);
		System.out.println(emp);
		System.out.println();
		
	}
	
	public static void main(String[] args)throws IOException {
		
	
		File file=new File("mahe.csv");
		Scanner sc=new Scanner(file);
		sc.useDelimiter(System.getProperty("line.separator"));
		while(sc.hasNext())
		{
			EmployeeDashboard.call(sc.next());		
		}
		sc.close();
		Employee.check(Salary);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(new Employee("Srujitha",989496,40000));	
		list.add(new Employee("Noorul",980445,42000));
		list.add(new Employee("Kuldeep",773767,50000));
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println();
		Comparator<Employee> comp=(x,y)->{ if(x.getSalary()<y.getSalary()) return 1; else return -1;};
		Collections.sort(list, comp);
		list.forEach(x->{System.out.println(x);});
			
	}
	/*public static Employee parseCSVLine(String line)
	{
		Scanner scan=new Scanner(line);
		scan.useDelimiter("\\s*,\\s*");
		String name=scan.next();
		int empID=scan.nextInt();
		int salary=scan.nextInt();
		return new Employee(name,empID,salary);		
	}*/
	
	
}

