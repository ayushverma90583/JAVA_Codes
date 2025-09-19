class Circle 
{
// Its a normal Class With Normal Methord...
    public void radius()
    {
        float radius;
        radius = 5;
        System.out.println("Area of circle :- "+Math.PI*radius*radius);
    }
}
// Traingle class inherit the Circle Class
class Traingle extends Circle
{
// We make a Constructor
    Traingle()
    {
        System.out.println("I am a Traingle.");
    }
// We make Constructor with arguments ( Constructor Overloading )
    Traingle(int a)
    {
        System.out.println("I am a Equilateral Traingle with Side :- "+a);
    }
}
// Rectangle class inherit Traingle class
class Rectangle extends Traingle
{
// We make a Constructor
    Rectangle()
    {
        System.out.println("I am a Rectangle.");
    }
// We make Constructor with arguments ( Constructor Overloading )
    Rectangle(int a , int b)
    {
// super keyword is used for to call the constructor from the parent class
        super(a);
        System.out.println("I am a rectangle with Length "+a+" and Breadth "+b);
    }
}

class Constructor_Inheritance
{
    public static void main(String[] args)
    {
// if we call the Constructor by the arguments then the argument Constructor is executed 
        //Rectangle r = new Rectangle(2,4);
// if we call the Constructor without the arguments then the normal Constructor is executed 
        Rectangle r = new Rectangle();
        r.radius();
    }
}