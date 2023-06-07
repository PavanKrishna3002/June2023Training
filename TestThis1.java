class Student
{
int rollno;
String name;
float fee;
Student(int rollno,String n,float fee)
{
this.rollno=rollno;
this.name=n;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}
class TestThis1
{
public static void main(String args[])
{
Student s1=new Student(111,"Pavan",10000f);
Student s2=new Student(112,"Krishna",9000f);
Student s3=new Student(113,"Sharath",5000f);
s1.display();
s2.display();
s3.display();
}
}
