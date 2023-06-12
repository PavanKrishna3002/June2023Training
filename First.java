class First
{
public static void main(String args[])throws Exception
{
Thread t=Thread.currentThread();
System.out.println("CURRENT THREAD= "+t);
t.setName("New Thread by Pavan");
t.setPriority(t.getPriority()-1);
System.out.println("CURRENT THREAD= "+t);
System.out.println("NAME = "+t.getName());
}
}