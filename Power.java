import java.util.*;
class Power
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int r=1;
for(int i=1;i<=n2;i++)
r*=n1;
System.out.println("Power : "+r);
}
}