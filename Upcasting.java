class Animal
{
	public void eat()
	{
		System.out.println("eating");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("eating bones");
	}
}
class Upcasting
{
	public static void main(String[] args)
	{
		Animal d = new Dog();
		d.eat();
	}
}