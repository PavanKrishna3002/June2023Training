class TestDeadLock
{
public static void main(String args[])
{
final String resource1="Pavan";
final String resource2="Krishna";
Thread t1=new Thread()
{
public void run()
{
synchronized(resource1)
{
System.out.println("Thread 1: Locked resource1");
try
{
Thread.sleep(100);
}
catch(Exception e)
{
}
synchronized(resource2)
{
System.out.println("Thread1: Locked resource2");
}
}
}
};
Thread t2=new Thread()
{
public void run()
{
synchronized(resource2)
{
System.out.println("Thread 2: Locked resource2");
try
{
Thread.sleep(100);
}
catch(Exception e)
{
}
synchronized(resource1)
{
System.out.println("Thread2: Locked resource1");
}
}
}
};
t1.start();
t2.start();
}
}