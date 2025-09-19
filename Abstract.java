abstract class Smartphone
{
// We make Constructor
    Smartphone()
    {
        System.out.println("I am a cell phone that has functions like that of a computer\n");
    }
// These all the methords are abstract
    abstract public void Switchoff();
    abstract public void Switchon();
    abstract public void Ringtone();
}
// We have to Pass all the Methords in the class Realme Because it inherit Smartphone class
// If we dont pass all the methords it Shows error
// If we dont want error then maeke the realme class abstract 
class Realme extends Smartphone
{
    public void Switchoff()
    {
        System.out.println("Realme Mobile Is Switching OFF");
    }
    public void Switchon()
    {
        System.out.println("Realme Mobile Is Switching ON");
    }
    public void Ringtone()
    {
        System.out.println("Realme Phone is Ringing\n");
    }
}
// We have to Pass all the Methords in the class oppo Because it inherit Smartphone class
// If we dont pass all the methords it Shows error
// If we dont want error then maeke the oppo class abstract 
class Oppo extends Smartphone
{
    public void Switchoff()
    {
        System.out.println("Oppo Mobile IS Switching OFF");
    }
    public void Switchon()
    {
        System.out.println("Oppo Mobile Is Switching ON");
    }
    public void Ringtone()
    {
        System.out.println("Oppo Phone is Ringing\n");
    }
}
class Abstract
{
    public static void main(String[] args)
    {
        Realme r = new Realme();
        r.Switchoff();
        r.Switchon();
        r.Ringtone();
        Oppo o = new Oppo();
        o.Switchoff();
        o.Switchon();
        o.Ringtone();
    }
}