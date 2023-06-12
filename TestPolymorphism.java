import java.util.*;
class PolymorphismExample1
{
void print()
{
System.out.println("Welcome");
}
void print(String n)
{
System.out.println("Welcome "+n);
}
}
class TestPolymorphism
{
public static void main(String args[])
{
PolymorphismExample1 obj=new PolymorphismExample1();
obj.print();
Scanner sc=new Scanner(System.in);
System.out.println("Please enter your name: ");
String s=sc.next();
obj.print(s);
}
}