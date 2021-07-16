package FileConcepts;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class File_ReadTextFile {

	public static void main(String[] args) throws IOException {
		
		//1. First approach - Path
		Path path=Paths.get("file.txt");
		byte b[]=Files.readAllBytes(path);
		List<String> list=Files.readAllLines(path);
		System.out.println(list);
		System.out.println();
		
		//2. Second Approach - file Reader
		File file=new File("file.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		System.out.println();
		
		//3. Third Approach - Buffered Reader
		File f=new File("file.txt");
		FileInputStream fis=new FileInputStream(f);
		InputStreamReader inp=new InputStreamReader(fis);
		BufferedReader buf=new BufferedReader(inp);
		String lines;
		while((lines=buf.readLine())!=null)
		{
			System.out.println(lines);
		}
		System.out.println();
		
		//4. Fourth Approach
		File fi=new File("file.txt");
		Scanner sc=new Scanner(fi);
		while(sc.hasNextLine())
		{
			String li=sc.nextLine();
			System.out.println(li);
		}
	}

}
