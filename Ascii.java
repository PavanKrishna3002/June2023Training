import java.util.*;
public class Ascii
{
public static void main(String args[])
{
System.out.println("Enter a character:");
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
int ascii=(int) ch;
System.out.println("The ASCII value of character " +ch +"is:" +ascii);
}
}