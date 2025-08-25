class Animal
{
	public void Dog()
	{
		System.out.println("Dog is running");
	}
}
class Animal2 extends Animal
{
	public void Cat()
	{
		System.out.println("Cat is sleeping");
	}
}

class Inheritance
{
	public static void main(String [] args)
	{
		Animal2 a = new Animal2();
		a.Cat();
		a.Dog();
	}
}