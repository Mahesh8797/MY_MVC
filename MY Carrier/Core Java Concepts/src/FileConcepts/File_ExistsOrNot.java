package FileConcepts;
import java.io.File;
import java.io.IOException;
public class File_ExistsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file=new File("/Users/MD5047428/file.txt");
		File f=new File("file.txt");
		System.out.println(file.exists());
		System.out.println(f.exists());
		System.out.println();
		
		File f1=new File("Files");
		File f2=new File("Files/hi.txt");
		
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		System.out.println();
		
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
				
	}

}
