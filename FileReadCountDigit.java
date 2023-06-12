import java.io.*;
class FileReadCountDigit
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("E:\\fh\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countDigit=0;
while((i=br.read())!=-1)
{
if(i=='0'||i=='1'||i=='2'||i=='3'||i=='4'||
i=='5'||i=='6'||i=='7'||i=='8'||i=='9')
countDigit++;
}
System.out.println(countDigit);
br.close();
fr.close();
}
}