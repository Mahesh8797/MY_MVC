package Java_11_Features;

public class String_CodePointsAndChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hello="maheyo";
		hello.codePoints().forEach(i->System.out.print(i+ " "));
		System.out.println();
		hello.chars().forEach(i->System.out.print(i+ " "));
	}

}
