package FileConcepts;
import java.io.File;
import java.io.IOException;

public class File_CreateNewFile {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileSeparator= System.getProperty("file.separator");
		
		//1.absolute path
		String abspath= fileSeparator+"Users"+fileSeparator+"MD5047428"+fileSeparator+"file.txt";
		File file=new File(abspath);
		if(file.createNewFile())
		{
			System.out.println("File created int the path "+abspath);
		}
		else
		{
			System.out.println("File failed to create ");
		}
		
		//2.direct file name
		File f=new File("file.txt");
		if(f.createNewFile())
		{
			System.out.println("File created int the path ");
		}
		else
		{
			System.out.println("File failed to create as it already exists ");
		}
		
		//3.relative path
		String relativePath= "tmp"+fileSeparator+ "file.txt";
		File files=new File(relativePath);
		if(files.createNewFile())
		{
			System.out.println("File created int the path ");
		}
		else
		{
			System.out.println("File failed to create ");
		}
	}

}
