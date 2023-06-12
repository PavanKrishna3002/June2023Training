import java.util.*;
class Test9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char ch=sc.next().charAt(0);
char c=s.charAt(0);
for(int i=0;i<=s.length()-1;i++)
{
if(s.charAt(i)==ch)
{
System.out.print("");
}
else
System.out.print(s.charAt(i));
}
}
}