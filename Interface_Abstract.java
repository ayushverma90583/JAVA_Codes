// We make a interface class name BasicAnimal ( Interface takes all the abstract methords )
interface BasicAnimal
{
    public void eat();
    public void sleep();
}
// We make a Monkey class
class Monkey
{
    public void jump()
    {
        System.out.println("Monkey is Jumping.");
    }
    public void bite()
    {
        System.out.println("Monkey Bites Me.");
    }
}
// Human class inherit Monkey class and Implements BasicAnimal
class Human extends Monkey implements BasicAnimal
{
    public Human()
    {
        System.out.println("I Am Human.");
    }
    public void eat()
    {
        System.out.println("Human is eating.");
    }
    public void sleep()
    {
        System.out.println("Human is Sleeping.");
    }
}
class Interface_Abstract
{
    public static void main(String[] args)
    {
        Human h = new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
}
