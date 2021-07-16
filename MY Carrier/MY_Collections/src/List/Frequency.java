package List;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="MaheMgamma";
		char ch=' ';
		str=str.trim();
		int count ;
	
		for(char c='A';c<='z';c++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				
				ch=str.charAt(j);
				if(ch==c)
				{
					count++;
					
				}
			}
			if(count!=0)
			System.out.println("Char "+c +" "+count);
		
			
		}
		
	}

}
