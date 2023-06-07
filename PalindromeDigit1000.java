import java.util.*;
class PalindromeDigit1000
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
int i=0;
System.out.print("Enter any positive integer: ");
n=sc.nextInt();
for(i=0;i<=1000;i++)
{
rd=rd*10+n%10;
n=n/10;
if(n==rd)
System.out.println(rd);
}
}
}