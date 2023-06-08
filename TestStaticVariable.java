class Student
{
int rollno;
String name;
static String college="MTIET";
Student(int r,String n)
{
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class TestStaticVariable
{
public static void main(String args[])
{
Student.college="MTIET";
Student s1=new Student(111,"Pavan");
Student s2=new Student(112,"Krishna");
s1.display();
s2.display();
}
}
