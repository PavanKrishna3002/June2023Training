import java.io.*;
class FileReadCountConsonents
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("E:\\fh\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countConsonents=0;
while((i=br.read())!=-1)
{
if((char)i!='a'&&(char)i!='e'&&(char)i!='i'&&(char)i!='o'&&(char)i!='u'&&
(char)i!='A'&&(char)i!='E'&&(char)i!='I'&&(char)i!='O'&&(char)i!='U'&&i!='0'&&i!='0'
&&(char)i!='!'&&i!='1'&&i!='2'&&i!='3'&&i!='4'&&i!='5'&&i!='6'&&i!='7'&&i!='8'&&i!='9'
&&(char)i!='@'&&(char)i!='#'&&(char)i!='$'&&(char)i!='%'&&(char)i!='^'&&(char)i!='&'
&&(char)i!='*'&&(char)i!='-'&&(char)i!='+'&&(char)i!='='&&(char)i!='>'&&(char)i!='<')
countConsonents++;
}
System.out.println(countConsonents);
br.close();
fr.close();
}
}