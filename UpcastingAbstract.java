import java.util.Scanner;
abstract class Fruit
{
	public abstract void Mango();
}
class Fruit2 extends Fruit
{
	public void Mango()
	{
		System.out.println("Mango is Sweet");
	}
}
class Fruit3 extends Fruit2
{
	public void Mango()
	{
		System.out.println("Mango is Sour");
	}
}
class UpcastingAbstract
{
	public static void main(String[] args)
	{
		Fruit2 f = new Fruit3();
		f.Mango();
	}
}