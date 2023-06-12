import java.io.CharArrayWriter;
import java.io.CharArrayReader;
import java.io.FileWriter;
public class FileReader2
{
public static void main(String args[])throws Exception
{
CharArrayWriter out=new CharArrayWriter();
out.write("Welcome to java training");
File source=new File("E:\\fh\\a.txt");
File destination=new File("E:\\fh\\b.txt");
FileInputStream inputStream=new FileInputStream(source);
FileOutputStream outStream=new FileOutputStream(destination);
System.out.println("Success...");
}
}
