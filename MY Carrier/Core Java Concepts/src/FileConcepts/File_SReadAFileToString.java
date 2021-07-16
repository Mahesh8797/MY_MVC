package FileConcepts;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class File_SReadAFileToString {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("file.txt");
		//1. first approach
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		String ls=System.getProperty("line.separator");
		StringBuilder sb=new StringBuilder();
		while((line=br.readLine())!=null)
		{
			sb.append(line);
			sb.append(ls);			
		}
		//sb.deleteCharAt(sb.length()-1);
		br.close();
		String content=sb.toString();
		System.out.println(content);
		System.out.println();
		
		//2. Second approach
		FileInputStream fs=new FileInputStream(file);
		byte[] buffer=new byte[10];
		byte length;
		StringBuilder sub=new StringBuilder();
		while(((byte) fs.read(buffer))>0)
		{
			sub.append(new String(buffer));
		}
		String con=sub.toString();
		System.out.println(con);
		System.out.println();
		
		//3. using files
		Path path=Paths.get("file.txt");
		String cont=new String(Files.readAllBytes(path));
		System.out.println(cont);
		System.out.println();
		
		//4.using scanner class
		Scanner sc=new Scanner(new File("file.txt"));
		String c=sc.useDelimiter("\\A").next();
		System.out.println(c);
		
	}

}
