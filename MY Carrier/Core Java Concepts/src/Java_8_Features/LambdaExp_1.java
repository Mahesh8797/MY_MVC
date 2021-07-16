package Java_8_Features;

interface MAYO
{
	void display();
}
public class LambdaExp_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//anonymous inner class approach
		MAYO m=new MAYO()
				{
					public void display() {
					System.out.println("Display");						
					}			
				};
		m.display();
		
		//lambda approach
		MAYO m1=()->System.out.println("hello");
		m1.display();
	}

}
