import java.util.Scanner;
class Parents
{
	Scanner scan = new Scanner(System.in);
	public void parentage()
	{
		int age,age1;
		System.out.println("Write the age of the Mother :- ");
		age=scan.nextInt();
		System.out.println("Write the age of the Father :- ");
		age1=scan.nextInt();
		System.out.println("Mothers age :- "+age);
		System.out.println("Fathers age :- "+age1);
	}
}
class Child extends Parents
{
	public void childageandname()
	{
		int age;
		String name;
		System.out.println("Write the age of the Child :-");
		age=scan.nextInt();
		System.out.println("Write the name of the Child :-");
		name=scan.next();
		System.out.println("Age of the Child :-"+age);
		System.out.println("Name of the Child :-"+name);
	}
}
class Inheritance2
{
	public static void main(String[] args)
	{
		Child c = new Child();
		c.parentage();
		c.childageandname();
	}

}
