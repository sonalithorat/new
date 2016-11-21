abstract class Bike
{
	abstract void run();
	
}
public class Honda extends Bike{
	
	void run()
	{
		System.out.println("running safely....");
	}

	public static void main(String[] args) {
		//Honda b=new Honda();
		Bike b=new Honda();
		//Bike b=new Bike();// cant create the object of bike.
		b.run();

	}

}
