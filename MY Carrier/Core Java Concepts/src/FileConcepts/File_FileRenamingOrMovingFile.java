package FileConcepts;
import java.io.File;
import java.io.IOException;
public class File_FileRenamingOrMovingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("Files/Hello1.txt");
		File newfile=new File("Files/hi.txt");
		if(file.renameTo(newfile))
		{
			System.out.println("file rename is success");
		}
		else
		{
			System.out.println("file rename is failed");
		}
		
		File f1=new File("Files/hi.txt");
		File f2=new File("File/hi.txt");
		if(f1.renameTo(f2))
		{
			System.out.println("file moving is success");
		}
		else
		{
			System.out.println("file moving is failed");
		}
		
	}

}
