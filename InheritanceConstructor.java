class Function
{
	public Function(int age)
	{
		System.out.println("I am "+age+" Years old .");
	}
}
class abc extends Function
{
	public abc()
	{
		super(18);
	}
}

class InheritanceConstructor
{
	public static void main(String[] args)
	{
		abc a = new abc();
	}
}
