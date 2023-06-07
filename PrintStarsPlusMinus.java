import java.util.*;
class PrintStarsPlusMinus
{
public static void printmultipleStar(int i,char c)
{
for(int k=1;k<=i;k=k+1)
System.out.println(c);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int j=sc.nextInt();
char c1=sc.next().charAt(0);
char c2=sc.next().charAt(0);
char c3=sc.next().charAt(0);
printmultipleStar(j,c1);
printmultipleStar(j+1,c2);
printmultipleStar(j-2,c3);
System.out.println(" ");
}
}