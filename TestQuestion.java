import java.util.Scanner;
class TestQuestion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
String str="";
for(int i=0;i<=n1;i=i+n2)
{
str=str+i+",";
}
for(int i=0;i<str.length()-1;i++)
System.out.print(str.charAt(i));
}
}