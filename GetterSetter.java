class Function
{
	int age;
	public int getage()
	{
		return age;
	}
	public void setage(int a)
	{
		age = a;
	}
}
class GetterSetter
{
	public static void main(String[] args)
	{
		Function f = new Function();
		f.setage(3);
		System.out.println(f.getage());
	}
}