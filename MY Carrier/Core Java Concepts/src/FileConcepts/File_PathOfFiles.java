package FileConcepts;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class File_PathOfFiles {

	public static void main(String[] args) throws IOException,URISyntaxException {
		// TODO Auto-generated method stub
		File file=new File("/Users/MD5047428/File.txt");
		printPath(file);
		
		File fs=new File("hello.txt");
		printPath(fs);
		
		File f=new File(new URI("file:///Users/MD5047428/File.txt"));
		printPath(f);
		
		
	}

	public static void printPath(File file) throws IOException
	{
		System.out.println("Absolute path : "+ file.getAbsolutePath());
		System.out.println("Canonical path : "+ file.getCanonicalPath());
		System.out.println("Path : "+file.getPath());
	}
}
