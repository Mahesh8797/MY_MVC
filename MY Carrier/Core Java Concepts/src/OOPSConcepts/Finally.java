package OOPSConcepts;

 interface Mahe {
	int a=10;
	void show();
}

 interface Aarthi
{
	int b=20;
	void print();
}

 interface Yoge extends Mahe,Aarthi
 {
	 int c=20;
	 int d=30;
 } 
/* abstract class Someone implements Aarthi
 {
	 private String name="MY";
	 abstract void display();
 }
 */
class yaro  implements Mahe
 {

	@Override
	public void show() {
		System.out.println("I will be displayed first");
	}
	 
 }
 
 class evano implements Yoge 
 {

	@Override
	public void show() {
		
		System.out.println("I will be displayed second");
	}

	@Override
	public void print() {
		System.out.println("I will be displayed Third");
		
	}
	 
 }
 
 public class Finally extends evano
 {
	 public static void main(String args[])
	 {
		 Mahe m=new Finally();
		 Yoge y=new Finally();
		 y.show();
		 y.print();
		 yaro yo=new yaro();
		 yo.show();
		 
		 
	 }
 }