import java.util.Scanner;
class Input2
{
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public static int sub(int a,int b)
{
int c=a-b;
return c;
}
public static int mul(int a,int b)
{
int c=a*b;
return c;
}
public static int div(int a,int b)
{
int c=a/b;
return c;
}
public static int mod(int a,int b)
{
int c=a%b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter the number:");
int num1;
num1=scob.nextInt();
System.out.print("Enter the number:");
int num2;
num2=scob.nextInt();
System.out.println(num1 + "+" +num2 +"="+add(num1,num2));
System.out.println(num1 + "-" +num2 +"="+sub(num1,num2));
System.out.println(num1 + "*" +num2 +"="+mul(num1,num2));
System.out.println(num1 + "/" +num2 +"="+div(num1,num2));
System.out.println(num1 + "%" +num2 +"="+mod(num1,num2));
}
}
