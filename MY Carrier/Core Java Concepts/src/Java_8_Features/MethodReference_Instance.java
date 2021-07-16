package Java_8_Features;

interface BiFunction
{
	void apply();
}
public class MethodReference_Instance {

	public void display()
	{
		System.out.println("I am an instance method");
	}
	public static void main(String[] args) {
		
		MethodReference_Instance instance=new MethodReference_Instance();
		BiFunction bf=instance::display;
		bf.apply();
	}

}
