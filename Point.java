class Point
{
double x,y;
public void setx(double a){x=a;}
public void sety(double b){y=b;}
public double getx(){return x;}
public double gety(){return y;}
public static void main(String args[])
{
Point p=new Point();
p.setx(2);
p.sety(3);
System.out.println(p.getx()+" "+p.gety());
}
}