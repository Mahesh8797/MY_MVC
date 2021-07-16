package OOPSConcepts;
class Sample
{
	private int id;
	private String name;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		 this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	private String identity="right"; ///we can also change this value
	public String getIden()
	{
		return identity;
	}
	public void setIden(String value)
	{
		this.identity=value;
	}
}
public class Encapsulation extends Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
Encapsulation en=new Encapsulation();
en.setId(5047428);
System.out.println(en.getId());
en.setName("Maheshwari");
System.out.println(en.getName());	
en.setIden("I am not mine");
System.out.println(en.getIden());
	}
}
