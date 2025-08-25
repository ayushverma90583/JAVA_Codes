class Animal
{
	public final void Dog()
	{
		int a;
		for(a=1; a<=3; a++)
		{
			System.out.print(a+". Walking");
		}
	}
}
class Pet extends Animal
{
	public void Dog()
	{
		int a;
		for(a=1; a<=3; a++)
		{
			System.out.print(a+". Running");
		}
	}
}
class TestFinal3
{
	public static void main(String[] args)
	{
		Pet p = new Pet();
		p.Dog();
	}
}