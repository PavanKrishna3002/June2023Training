class Bike
{
void run()
{
System.out.println("Running");
}
}
class Honda extends Bike
{
void run()
{
System.out.println("Running safely with 100 kmph");
}
public static void main(String args[])
{
Honda obh=new Honda();
obh.run();
}
}