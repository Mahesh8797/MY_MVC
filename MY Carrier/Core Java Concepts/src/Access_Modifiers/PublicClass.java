package Access_Modifiers;

public class PublicClass {
	
	public int num=10;
	private String name="mahe";
	 protected int print()
	{
		return num;
	}
	protected String display()
	{
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicClass pc=new PublicClass();
		System.out.println(pc.print());
		System.out.println(pc.display());
		System.out.println(12>>1);
	}

}
