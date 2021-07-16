package FileConcepts;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class File_WriterAppendToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("file.txt");
		FileWriter fr=new FileWriter(file,true);
		fr.write("data");
		fr.close();

	}

}
