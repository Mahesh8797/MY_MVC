package Access_Modifiers;

public class Sample {
 private int num=10;
 public int sum=20;
 public int abc=num+sum;
 
public static void main(String args[])
{ 
	//accessing the class which is outside the package
	Outerclass c=new Outerclass();
	System.out.println(c.num);
	Sample s=new Sample();
	System.out.println(s.abc);
	}
}