package FileConcepts;
import java.io.File;
public class File_Permissions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("/Users/MD5047428/File.txt");
		System.out.println("Read : "+ file.canRead());
		System.out.println("Write : "+ file.canWrite());
		System.out.println("Execute : "+ file.canExecute());
		
		file.setReadable(false);
		file.setWritable(false);
		file.setExecutable(true);
	}
}
