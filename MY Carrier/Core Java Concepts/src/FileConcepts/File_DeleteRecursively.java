package FileConcepts;
import java.io.File;
import java.io.IOException;
public class File_DeleteRecursively {

	static void recursive_delete(File file)
	{
		if(!file.exists())
		{
		 return ;
		}
		if(file.isDirectory())
		{
		File[] files=file.listFiles();
		 for(File f: files)
		 {
			 recursive_delete(f);
		 }
	}
		 file.delete();
		 System.out.println("deleted files/ directories "+file.getAbsolutePath() +" "+ file.getName());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("Temp");
		recursive_delete(file);
	}

}
