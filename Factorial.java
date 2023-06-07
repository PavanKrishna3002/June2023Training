import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int j=1;j<=n;j++)
fact*=j;
System.out.println("Factorial: "+fact);
}
}