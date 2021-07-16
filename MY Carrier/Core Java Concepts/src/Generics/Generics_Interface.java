package Generics;

interface Yog<T>
{
	void show(T value);
}
public class Generics_Interface implements Yog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Yog<String> y=new Generics_Interface();
		y.show("Integer"); //no matter what value i pass 
	}

	@Override
	public void show(Object value) {
		System.out.println(value.getClass().getName());
		
	}
	
}
