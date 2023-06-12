import java.util.*;
class DigitPattern3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
int s=sc.nextInt();
int sum=0;
for(int i=1;i<=s;i++)
{
System.out.println();
for(int j=1;j<=i;j++)
{
if(sum<=s)
{
System.out.print(sum);
sum=sum+1;
if(j<i)
{
System.out.print(",");
}
}
}
}
}
}