package FileConcepts;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
public class File_CreFileOutputStream  
{
	public static void main(String[] args)throws IOException {
		
		String data="Missing a lot";
		String fileSeparator= System.getProperty("file.separator");
		String abspath= fileSeparator+"Users"+fileSeparator+"MD5047428"+fileSeparator+"Files.txt";
		FileOutputStream fos=new FileOutputStream(abspath);
		fos.write(data.getBytes());  //we can write only bytes
		fos.flush();
		fos.close();
		
		System.out.println("File.Separator " + File.separator);
		System.out.println("File.SeparatorChar " + File.separatorChar);
		System.out.println("File.PathSeparator " + File.pathSeparator);
		System.out.println("File.PathSeparatorChar " + File.pathSeparatorChar);
		
	}

}
