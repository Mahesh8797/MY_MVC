package OOPSConcepts;
class Heart
{
	private int heartrate;

	public int getHeartrate() {
		return heartrate;
	}

	public void setHeartrate(int heartrate) {
		this.heartrate = heartrate;
	}
	
}

class Human
{
	Heart heart;
	public Human()
	{
		this.heart=new Heart();
		heart.setHeartrate(80);
	}
	
	public long getrate()
	{
		return heart.getHeartrate();
	}
}
public class X_Composition {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human h=new Human();
		System.out.println(h.getrate());
		
	}

}
