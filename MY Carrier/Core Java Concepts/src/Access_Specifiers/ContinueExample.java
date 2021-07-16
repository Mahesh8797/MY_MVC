package Access_Specifiers;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;;
		char a[]={'a','e','i','o','u'};
		for(i=0;i<a.length;i++)
		{
			
			if(a[i]=='o')
				continue;
			System.out.println(a[i]);
		}
		
		while(i<a.length)
		{
			
			if(a[i]=='o')
			{
				i++;
				continue;
				
			}
			System.out.println(a[i]);
			i++;
		}
		
	}

}
