class Shape
{
    int area;
    int perimeter;
    int side;
    public void Setside(int s)
    {
        side = s;
    }
    public int Getside()
    {
        return side;
    }
    public void perimeter()
    {
        perimeter = 4 * side;
        System.out.println("Perimeter of the Square :- "+perimeter);
    }
    public void area()
    {
        area = side * side;
        System.out.println("Area of the Square :- "+area);
    }

}
class Square
{
    public static void main(String[] args)
    {
        Shape s = new Shape();
        s.Setside(6);
        System.out.println("SIDE :- "+s.Getside());
        s.perimeter();
        s.area();
    }
}