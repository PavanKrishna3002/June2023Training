class A
{
public void funA1()
{
System.out.println("FunA1 called from A");
}
public void funA2()
{
System.out.println("\nFunA2 called from A");
}
}
class B
{
public static void main(String args[])
{
A ob=new A();
ob.funA1();
ob.funA2();
}
}
