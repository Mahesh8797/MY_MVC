package FileConcepts;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
public class File_FileSize {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("File/hi.txt");
		if(!file.exists()|| (!file.isFile()))
		{
			return;
		}
		System.out.println(getSizeByBytes(file));
		System.out.println(getSizeByKiloBytes(file));
		System.out.println(getSizeByMegaBytes(file));
		
		Path path=Paths.get("File/hi.txt");
		FileChannel filech= FileChannel.open(path);
		System.out.println(filech.size());
		
		//long size=FileUtils.size(file); //used in maven projects
		
		
	}
	private static Object getSizeByMegaBytes(File file) 
	{		
		return (double) file.length() / 1024*1024 + "gb";
	}
	private static Object getSizeByKiloBytes(File file)
	{		
		return (double) file.length() / 1024 + "kb";
	}
	private static Object getSizeByBytes(File file) 
	{		
		return file.length() + "mb";
	}
	
}
