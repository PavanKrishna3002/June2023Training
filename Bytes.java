import java.util.Scanner;
class Bytes
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int n3=1;
System.out.println("Enter the n1 value:");
for(int i=1;i<n2;i+=n2)
{
n1+=n3;
}
System.out.println(n3);
}
}
System.out.println(