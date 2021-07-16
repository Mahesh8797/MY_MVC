package Java_7_Features;

class Resource implements AutoCloseable
{

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am in another new resource");
	}
	
}
public class TryWithResource_2AutoCloseable {

	public static void main(String[] args){
		
		try(Resource r=new Resource())
		{
			System.out.println("Hi I am in try block");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("I am out of try catch block");
	}

}
