class Function
{
	public Function(int num)
	{
		int a,sum=0;
		for(a=0; a<=num; a++)
		{
			System.out.print(a+" ");
			sum=sum+a;
		}
		System.out.println("Sum :- "+sum);
	}
	public void Substract()
	{
		int a,b,s;
		a=20;
		b=10;
		s=a-b;
		System.out.println("Substract :- "+s);
	}
}
class ParameterConstructor
{
	public static void main(String[] args)
	{
		Function f = new Function(10);
		f.Substract();
	}

}
