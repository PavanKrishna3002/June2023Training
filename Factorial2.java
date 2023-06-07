import java.util.*;
class Factorial2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int fact=1;
int j=1;
while(j<=i)
{
fact*=j;
j++;
}
System.out.println("Factorial: "+fact);
}
}