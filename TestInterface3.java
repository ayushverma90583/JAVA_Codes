interface Chai
{
	public void Water();
	public void Patti();
	public void Sugar();
	public void Milk();
}
class Tea implements Chai
{
	public void Water()
	{
		System.out.println("1. Add Water To bowl...");
	}
	public void Patti()
	{
		System.out.println("2. Add Chai Patti in Water...");
	}
	public void Sugar()
	{
		System.out.println("3. Add Sugar in Water...");
	}
	public void Milk()
	{
		System.out.println("4. Add Milk into the Water... and Wait for Boiling");
	}	
}
class TestInterface3
{
	public static void main(String[] args)
	{
		Tea t = new Tea();
		t.Water();
		t.Patti();
		t.Sugar();
		t.Milk();
	}
}