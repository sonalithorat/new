abstract class Shape
{
	abstract void draw();
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
class Oval extends Shape
{
	void draw()
	{
		System.out.println("drawing oval");
	}
}
public class TestAbstraction {

	public static void main(String[] args) {
		Shape c=new Circle();
		Shape o=new Oval();
		c.draw();
		o.draw();
	}

}
