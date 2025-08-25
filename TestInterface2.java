interface Function
{
	public void Mango();
	public void orange();
	public void grapes();
}
class Fruit implements Function
{
	public void Mango()
	{
		System.out.println("Mango is sweet");
	}
	public void orange()
	{
		System.out.println("Orange is Sour");
	}
	public void grapes()
	{
		System.out.println("Grapes are small");
	}
}
class TestInterface2
{
	public static void main(String args[])
	{
		Fruit f = new Fruit();
		f.Mango();
		f.orange();
		f.grapes();
	}
}