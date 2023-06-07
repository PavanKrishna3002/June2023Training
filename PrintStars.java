import java.util.*;
class PrintStars
{
public static void printmultipleStar(int i)
{
for(int k=1;k<=i;k=k+1)
System.out.println(" * ");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
printmultipleStar(j);
System.out.println(" ");
}
}