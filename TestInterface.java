interface Animal
{
	public void eat();
	public void sleep();
	public void move();
}
class Dog implements Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	public void move()
	{
		System.out.println("Moving");
	}
}
class TestInterface
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.sleep();
		d.move();
	}
}