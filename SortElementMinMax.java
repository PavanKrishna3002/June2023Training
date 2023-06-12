import java.util.*;
class SortElementMinMax
{
public static void main(String args[])
{
int n,x,i=0,sum=0;
Scanner s=new Scanner(System.in);
n=s.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
System.out.println(a[0]);
System.out.println(a[n-1]);
if(a[n-1]==a[n-2])
{
System.out.println(a[n-3]);
}
else
System.out.println(a[n-2]);
for(int k:a)
sum+=k;
System.out.println(sum);
System.out.println((double)sum/n);
}
}