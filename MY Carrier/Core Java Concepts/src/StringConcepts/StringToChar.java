package StringConcepts;

public class StringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//string to charArray
		String str="I am not new to java";
		char a[]=str.toCharArray();
		char b=str.charAt(2);
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println("Converting string to char "+a[i]);
		}
		System.out.println("printing char at specific index "+b);
		
	
		char chars[]=new char[10];
		str.getChars(0, 6, chars, 1);
		System.out.println(chars); //dest+(src-des)-1;
		
		//charArray to String
		char arr[]= {'M','A','H','E'};
		String sum=new String(arr);
		System.out.println(sum);
		
	}

}
