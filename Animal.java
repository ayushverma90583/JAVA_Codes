abstract class Dog
{
	public abstract void eat();
}
class Puffy extends Dog
{
	public void eat()
	{
		System.out.println("Finally Abstract happen");
	}
}
class Animal
{
	public static void main(String[] args)
	{
		Puffy d = new Puffy();
	}
}

