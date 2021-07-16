package Access_Specifiers;

public class BreakExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for ( i=0;i<10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		
		while(i<10)
		{
			System.out.println(i);
			i++;	
		if(i==5)		
			break;	
		
		}
		
		do
		{
			System.out.println(i);
			i++;	
		if(i==5)		
			break;	
		}while(i<10);
	}

}
