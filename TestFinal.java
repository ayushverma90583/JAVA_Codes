final class Total
{
	public void Sum()
	{
		int a,b,sum;
		a=40;
		b=30;
		sum=a+b;
		System.out.println("Sum :- "+sum);
	}
}
class Function extends Total
{
	public void Multiply()
	{
		int a,b,m;
		a=2;
		b=5;
		m=a*b;
		System.out.println("Multiply :- "+m);
	}
}
class TestFinal
{
	public static void main(String[] args)
	{
		Function f = new Function();
		f.Sum();
		f.Multiply();
	}
}