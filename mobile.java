class Bluetooth
{    
    int a=20;
    protected String earpod = "AIR NOVA";
    public void b()
    {
        System.out.println("Connect The bluetooth...with :- "+earpod+a);
    }
}
class earpods extends Bluetooth
{
    public void ep()
    {
        System.out.println("My name is :- "+earpod+a);
    }
}
class mobile
{
    public static void main(String[] args)
    {
        earpods e = new earpods();
        e.ep();
        e.b();
    }
}