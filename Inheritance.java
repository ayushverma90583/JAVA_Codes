class Rectangle1
{
    int l,b;
    public void Setarea(int l , int b)
    {
        this.l=l;
        this.b=b;
    }
    public int Getarea()
    {
        return l*b;
    }
}
class Cuboid extends Rectangle1
{
    
    int l,b,h;
    public void Setarea(int l, int b, int h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public int Getarea()
    {
        return 2*(l*b+b*h+h*l);
    }

    public void volume(int l , int b , int h)
    {
        System.out.println("Volume of the Cuboid :- "+l*b*h);
    }
}


class Inheritance
{
    public static void main(String[] args)
    {
        Cuboid c = new Cuboid();
        Rectangle1 r = new Rectangle1();
        c.Setarea(5,4,9);
        System.out.println("Area of the Cuboid :- "+c.Getarea());
        c.volume(2,2,2);
        r.Setarea(7,6);
        System.out.println("Area of Rectangle :- "+r.Getarea());
    }
}