class Cylinder
{
    float pi = 3.14f;
    float radius;
    float height;
    float volume;
    public void Setradius(int r)
    {
        radius = r;
    }   
    public float Getradius()
    {
        return radius;
    } 
    public void Setheight(int h)
    {
        height = h;
    }
    public float Getheight()
    {
        return height;
    }
//Formula of the Volume of Cylinder :- πr2h
    public void Volume()
    {
        System.out.println("Volume of the Cylinder :- "+pi*radius*radius*height);
    }
//Formula of the Surface Area of the Cylinder :- 2πrh+2πr2
    public void Surfacearea()
    {
        System.out.println("Surface Area of the Cyclinder :- "+(2*pi*radius*height+2*pi*radius*radius));
    }
}
class Gettersetter
{
    public static void main(String[] args)
    {
        Cylinder c = new Cylinder();
        c.Setradius(4);
        c.Setheight(10);
        System.out.println("Radius of the Cylinder :- "+c.Getradius());
        System.out.println("Height of the Cylinder :- "+c.Getheight());
        c.Volume();
        c.Surfacearea();
    }
}