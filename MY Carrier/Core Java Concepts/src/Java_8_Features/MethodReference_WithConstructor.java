package Java_8_Features;
 
interface Messagable
{
	void getMessage(String msg);
}
class Message
{
	Message(String msg)
	{
		System.out.println(msg);
	}
}
public class MethodReference_WithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Messagable m=Message::new;
		m.getMessage("maheY");
		
	}

}
