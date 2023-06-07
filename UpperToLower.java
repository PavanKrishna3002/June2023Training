import java.util.*;
class UpperToLower
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String temp="";
int ascii;
for(int i=0;i<=str.length()-1;i++)
{
if(str.charAt(i)>='A' && str.charAt(i)<='Z')
{
ascii=str.charAt(i);
ascii+=32;
temp=temp+(char)ascii;
}
else
temp=temp+str.charAt(i);
}
System.out.println(temp);
str=temp;
String rev="";
for(int i=str.length()-1;i>=0;i--)
rev=rev+str.charAt(i);
}
}

