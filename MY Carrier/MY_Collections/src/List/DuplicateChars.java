package List;

public class DuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="amadam";
		int count;
		char ch;
		for(char c='a';c<'z';c++)
		{
			count=0;
			for(int i=0;i<s.length();i++)
			{
				ch=s.charAt(i);
				if(ch==c)
				{
					count++;
				}
				
			}
			if(count>1)
			{
				System.out.println("The repeated char is "+c+ " "+count);
			}
		}
	}

}
