import java.io.*;
public class BufferedReaderEx2
{
public static void main(String ars[])throws Exception
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name="";
while(!name.equals("stop"))
{
System.out.println("Enter data: ");
name=br.readLine();
System.out.println("Data is: "+name);
}
br.close();
r.close();
}
}