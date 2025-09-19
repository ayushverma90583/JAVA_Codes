abstract class Pen
{
    public Pen()
    {
        System.out.println("I am a Pen Brand Name \"TRIMAX\""); 
    }
    abstract public void Write();
    abstract public void Refill();
}
class Trimaxpen extends Pen
{
    public void Write()
    {
        System.out.println("I am Ayush Verma... , A BCA Student");
    }
    public void Refill()
    {
        System.out.println("Refill the INK of the Pen.");
    }
    public void Changenib()
    {
        System.out.println("Change the Nib of the Pen.");
    }
}
class Abstract_2
{
    public static void main(String[] args)
    {
        Trimaxpen t = new Trimaxpen();
        t.Write();
        t.Refill();
        t.Changenib();
    }
}