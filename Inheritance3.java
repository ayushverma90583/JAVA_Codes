class shape
{
	public void circle()
	{
		int area,pi,r;
		pi=22/7;
		r=5;
		area=pi*r*r;
		System.out.println("Area of Circle :- "+ area);
	}
}
class shape2 extends shape
{
	public void rectangle()
	{
		int l,b,area;
		l=20;
		b=6;
		area=l*b;
		System.out.println("Area of Rectangle :- "+area);
	}
}
class shape3 extends shape
{
	public void square()
	{
		int side,area;
		side=4;
		area=side*side;
		System.out.println("Area of Square :- "+area);
	}
}
class Inheritance3
{
	public static void main(String[] args)
	{
		shape2 s2=new shape2();
		shape3 s3=new shape3();
		s2.circle();
		s2.rectangle();
		s3.circle();
		s3.square();
	}
}