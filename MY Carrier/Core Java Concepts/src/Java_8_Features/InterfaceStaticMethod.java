package Java_8_Features;

 interface MY
 {
	 static void print()
	 {
		 System.out.println("I can neither forgive nor forget");
	 }
 }
 
public class InterfaceStaticMethod implements MY{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MY.print();
	}

}
