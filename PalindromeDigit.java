import java.util.*;
class PalindromeDigit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int rd;
System.out.print("Enter an Integer: ");
n=sc.nextInt();
int len=n;
for(rd=0;n>0;n=n/10)
{
rd=rd*10+(n%10);
}
if(len==n)
System.out.println(len+" is palindrome");
else
System.out.println(len+" is not a palindrome");
}
}