public class WrapperExample4
{
public static void main(String args[])
{
Byte b=10;
Short s=20;
Integer i=30;
Long l=40;
Float f=50.0F;
Double d=60.0D;
Character c='a';
Boolean b2=true;
Byte byteobj=b;
short shortobj=s;
int intobj=i;
long longobj=l;
float floatobj=f;
double doubleobj=d;
char charobj=c;
boolean boolobj=b2;
System.out.println("Printing object values");
System.out.println(b +" "+s+" "+i+" "+l+" "+f+" "+d+" "+c+" "+b2);
System.out.println("Printing primitive values");
System.out.println(byteobj+" "+shortobj+" "+intobj+" "+longobj+" "+floatobj+" "+doubleobj+" "+charobj+" "+boolobj);
}
}