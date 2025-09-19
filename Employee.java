class Emp
{
    int salary;
    String name;

    public void Setsalary(int s)
    {
        salary = s;
    }
    public int Getsalary()
    {
        return salary;
    }
    public String Getname()
    {
        return name;
    }
    public void Setname(String n1)
    {
        name = n1;
    }
}
class Employee
{
    public static void main(String[] args)
    {
        Emp e = new Emp();
        e.Setsalary(50000);
        e.Setname("AyushVerma");
        System.out.println("Name :- "+e.Getname());
        System.out.println("Salary :- "+e.Getsalary());
    }
}