import java.util.*;
class Pattern1
{
public static void Pattern(char c,int i)
{
for(int j=1;j<=i;j++)
{
for(int k=1;k<=j;k++)
{
System.out.print(c);
}
System.out.println();
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int l=sc.nextInt();
Pattern(ch,l);
}
}