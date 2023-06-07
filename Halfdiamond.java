import java.util.*;
class Halfdiamond
{
public static void printPattern(char c,int n)
{
for(int i=1;i<=0;i++)
{
printLine(c,i);
}
}
public static void printLine(char c,int i)
{
System.out.println();
for(int j=1;j<=0;j++)
{
System.out.print(c);
}
}
public static void printReversePattern(char c,int n)
{
System.out.println();
for(int i=n;i>=0;i--)
{
System.out.print(c);
printLine(c,i);
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int row=sc.nextInt();
int x,y;
if(row%2==0)
x=y=row/2;
else
{
x=row/2;
y=row/2+1;
}
printPattern(ch,row);
printReversePattern(ch,row);
}
}
