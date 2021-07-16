package FileConcepts;
import java.io.File;
import java.io.IOException;
public class File_DeleteNonEmptyDirectory {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File dir=new File("tmp");
		
		if(dir.isDirectory()==false)
		{
			System.out.println("Directory does not exists");
		}
		File[] files=dir.listFiles();
		for(File file : files)
		{
			System.out.println("Deleting the file "+ file.getName());
			file.delete();
		}
		if(dir.delete())
		{
			System.out.println("Directory deleted "+ dir.getName());
		}
		else
		{
			System.out.println("Not deleted");
		}
	}

}
