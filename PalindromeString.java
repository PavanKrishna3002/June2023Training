import java.util.*;
class PalindromeString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String rs="";
for(int i=str.length()-1;i>=0;i--)
{
rs+=str.charAt(i);
}
if(rs.equalsIgnoreCase(str))
System.out.print("YES");
else
System.out.print("NO");
}
}