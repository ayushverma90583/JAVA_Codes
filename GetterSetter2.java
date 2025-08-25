class Function
{
	String name;
	int num;
	public String getname()
	{
		return name;
	}
	public void setname(String n)
	{
		name = n ;
	}
	public int getnum()
	{
		return num;
	}
	public void setnum(int b)
	{
		num = b;
	}
}
class GetterSetter2
{
	public static void main(String[] args)
	{
		Function f = new Function();
		f.setname("ayush");
		f.setnum(34);
		System.out.println(f.getname());
		System.out.println(f.getnum());
	}
}