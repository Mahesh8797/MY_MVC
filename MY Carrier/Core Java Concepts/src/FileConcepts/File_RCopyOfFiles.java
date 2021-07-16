package FileConcepts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class File_RCopyOfFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File source=new File("Files.txt");
		File dest=new File("file.txt");		
		filecopyusingStream(source,dest);
		
		source=new File("Files.txt");
		dest=new File("hello.txt");
		filecopyusingChannel(source,dest);
		
		Path sr=Paths.get("Files.txt");
		Path ds=Paths.get("new.txt");
		fileCopy(sr,ds);

	}

	
	private static void fileCopy(Path sr, Path ds) throws IOException
	{	
	    Files.copy(sr, ds,StandardCopyOption.REPLACE_EXISTING);
		
	}

	private static void filecopyusingChannel(File source, File dest) throws IOException 
	{
		FileChannel sourceCh=null;
		FileChannel destCh=null;
		
		sourceCh=new FileInputStream(source).getChannel();
		destCh=new FileOutputStream(dest).getChannel();
		destCh.transferFrom(sourceCh, 0, sourceCh.size());
			
	}

	private static void filecopyusingStream(File source, File dest) throws IOException
	{
		
		InputStream is=null;
		OutputStream os=null;
		is=new FileInputStream(source);
		os=new FileOutputStream(dest);
		byte[] buffer=new byte[1024];
		int length;
		while((length=is.read(buffer))>0)
		{
			os.write(buffer, 0, length);
		}
		
	}

}
