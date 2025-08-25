class Animal
{
	public void Dog()
	{
		final int a,b;
		for(a=1; a<=3; a++)
		{
			System.out.print(a+". Walking");
		}
		for(b=1; b<=3; b++)
		{
			System.out.print(b+". Running");
		}
	}
}

class TestFinal2
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.Dog();
	}
}