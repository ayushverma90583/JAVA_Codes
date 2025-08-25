class Function
{
	int a,b,sum;
	public void F1()
	{
		this.a=5;
		this.b=3;
		this.sum = this.a + this.b;
		System.out.println("Total :- "+this.sum);
	}
}
class This2
{
	public static void main(String[] args)
	{
		Function f=new Function();
		f.F1();
	}
}