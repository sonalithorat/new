interface A
{
	void a();
	void b();
	void c();
	void d();
}


abstract class B implements A
{
	public void a()
	{
		System.out.println("inm in a");
	}
}

class C extends B
{
	public void b()
	{
		System.out.println("inm in b");
	}
	
	public void c()
	{
		System.out.println("inm in c");
	}
	
	public void d()
	{
		System.out.println("inm in d");
	}
}
public class Test {

	public static void main(String[] args) {
		B b=new C();
		b.a();
		b.b();
		b.c();
		b.d();

	}

}
