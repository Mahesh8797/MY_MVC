package FileConcepts;
import java.io.File;
import java.util.Date;
public class File_LastModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f=new File("Files/hi.txt");
		long time=f.lastModified();
		System.out.println("The last modified time is "+ new Date(time));
	}
}
