import java.util.Scanner;
class Furniture
{
	Scanner scan = new Scanner(System.in);
	int p,pr,sum ;
	public int Getchair()
	{
		System.out.println("Write the price of the Chair :- ");
		p=scan.nextInt();
		return p;
	}
	public void Setchair(int p1)
	{
		p = p1;
	}
	public int Gettable()
	{
		System.out.println("Write the price of the Table :- ");
		pr=scan.nextInt();		
		return pr;
	}
	public void Settable(int p2)
	{
		pr = p2;
	}
	public int Getsum()
	{
		sum=p+pr;
		return sum;
	}
	public void Setsum(int s)
	{
		sum = s;
	}
}
class GetterSetter3
{
	public static void main(String[] args)
	{
		int s;
		Furniture f = new Furniture();
		f.Setchair(f.Getchair());
		f.Settable(f.Gettable());
		f.Setsum(f.Getsum());
		System.out.println("Total Sum of the Furniture :- "+f.Getsum());
	}
}