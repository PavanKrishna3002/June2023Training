import java.io.*;
class FileReadCountVowels
{
public static void main(String args[])throws Exception
{
FileReader fr=new FileReader("E:\\fh\\Demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
int countVowel=0;
while((i=br.read())!=-1)
{
if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u'||(char)i=='A'||(char)i=='E'||(char)i=='I'||(char)i=='O'||i=='U')
countVowel++;
}
System.out.println(countVowel);
br.close();
fr.close();
}
}