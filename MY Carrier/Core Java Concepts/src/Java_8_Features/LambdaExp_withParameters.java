package Java_8_Features;

interface Yog
{
	int print(int a, int b);
}
public class LambdaExp_withParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Yog y=(a,b)->{ return a+b;};
	System.out.println(y.print(10,20));
	}

}
