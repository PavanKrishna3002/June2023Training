import java.util.Scanner;
class Input3
{
public static double add(double a,double b)
{
double c=a+b;
return c;
}
public static double sub(double a,double b)
{
double c=a-b;
return c;
}
public static double mul(double a,double b)
{
double c=a*b;
return c;
}
public static double div(double a,double b)
{
double c=a/b;
return c;
}
public static double mod(double a,double b)
{
double c=a%b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter the number:");
double num1;
num1=scob.nextDouble();
System.out.print("Enter the number:");
double num2;
num2=scob.nextDouble();
System.out.println(num1 + "+" +num2 +"="+add(num1,num2));
System.out.println(num1 + "-" +num2 +"="+sub(num1,num2));
System.out.println(num1 + "*" +num2 +"="+mul(num1,num2));
System.out.println(num1 + "/" +num2 +"="+div(num1,num2));
System.out.println(num1 + "%" +num2 +"="+mod(num1,num2));
}
}
