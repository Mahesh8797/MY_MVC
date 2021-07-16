package FileConcepts;
import java.io.File;
import java.io.IOException;
import java.io.File;

public class TemporaryFilesCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file= File.createTempFile("Mahe", ".doc");
		File tempfile=File.createTempFile("Yoge", ".mahe", new File("Sample"));
		
		System.out.println(file.getCanonicalPath());
		System.out.println(tempfile.getCanonicalPath());
		
		file.deleteOnExit();
		tempfile.deleteOnExit();
		
	}

}
