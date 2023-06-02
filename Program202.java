import java.util.Scanner;
public class Program202
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(n/2*2==n)
System.out.println("Even");
else
System.out.println("Odd");
}
}
