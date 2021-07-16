package BaiscPrograms;

public class ReverseString {

	public static void call(String name)
	{
		try
		{
			if(name.length()>0)
			{
		String rev="";
		int num=name.length()-1;
		String sub=name.substring(num);
		rev=rev.concat(sub);
		System.out.print(rev);
		call(name.substring(0, num));
			}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      call("MaheYoge");
	}

}
