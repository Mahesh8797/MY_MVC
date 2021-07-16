import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilesConcepts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("new");
		System.out.println("Directory created "+file.mkdir());
		File f=new File("new/file.txt");
		if(f.createNewFile())
		{
			System.out.println("File created");
		}
		String data="I am revising my concepts of java";
		FileOutputStream fos=new FileOutputStream("new/file.txt");
		fos.write(data.getBytes());
		fos.close();
		
	
		File dir=new File("hello");
		if(dir.delete())
		{
			System.out.println("Directory deleted");
		}
		
		File file1=new File("hello.txt");
		if(file1.createNewFile())
		{
			System.out.println("file created");
		}
		if(file1.delete())
		{
			System.out.println("file deleted");
		}
		
		File direc=new File("hello");
		
		if(direc.isDirectory()==false)
		{
			System.out.println("dirctory does not exists");
		}
		/*File[] filess=direc.listFiles();
		for(File fi: filess)
		{
			fi.delete();
			System.out.println("file deleted");
		}
		if(direc.delete())
		{
			System.out.println("directory deleted");
		}
		*/
		File dire=new File("hello");
		direc.mkdir();
		
		File ff=new File("hello/hello.txt");
		/*while(ff.createNewFile())
		{
			System.out.println("file created");
		}*/
		File fs=new File("new/file.txt");
		while(ff.renameTo(fs))
		{
			System.out.println("file moved");
		}
		
		Path path=Paths.get("new/file.txt");
		byte[] b=Files.readAllBytes(path);
		List<String> list=Files.readAllLines(path);
		System.out.println(list);
		String lines;
		BufferedReader br=new BufferedReader(new FileReader("new/file.txt"));
		while((lines=br.readLine())!=null)
		{
			System.out.println(lines);
		}
		
		Path path1=Paths.get("new/file.txt");
		String daa="hello";
		//.byte buf[]=daa.getBytes();
		
		Files.write(path1, daa.getBytes());
		
	}

}
