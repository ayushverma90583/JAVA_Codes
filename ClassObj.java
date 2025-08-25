class Animal
{
	int dog,fish,snake;
	public void dog()
	{
		System.out.println("Dog is Running");
	}
	public void snake()
	{
		System.out.println("Snake is Crawling");
	}
	public void fish()
	{
		System.out.println("Fish is Swimming");
	}
}
class ClassObj
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.dog();
		a.snake();
		a.fish();
	}
}