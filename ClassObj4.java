class Animal
{	
	int legs;
	public void setlegs()
	{
		legs = 4;
	}
	public void display()
	{
		System.out.println("I am  goat, I am having "+legs+" legs");
	}
}
class ClassObj4
{	
	public static void main(String[] args)
	{
		Animal goat = new Animal();
		goat.setlegs();
		goat.display();
	}

}
