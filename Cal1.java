class Cal1 implements Runnable
{
public static void main(String args[])
{
Cal obj=new Cal();
Thread threadobj=new Thread(obj);
threadobj.start();
System.out.println("Threads inside main are very much useful in java");
}
public void run()
{
System.out.println("Threads from overridden run method are very useful in java");
}
}