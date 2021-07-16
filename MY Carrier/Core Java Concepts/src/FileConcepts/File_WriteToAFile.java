package FileConcepts;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class File_WriteToAFile {

	public static void main(String[] args) throws IOException {
		
		//1.Using  OutputStream
		String data1="Quarantine days learning";	
		FileOutputStream fos=new FileOutputStream("Files.txt");
		fos.write(data1.getBytes());
		
		//2.using buffered writer
		String data2="Completed till collections";	
		File f = new File("hello.txt");
        FileWriter fr = new FileWriter(f);
        BufferedWriter br = new BufferedWriter(fr);
        String dataWithNewLine=data2+System.getProperty("line.separator");       
        try{
                    
            br.write(dataWithNewLine);   
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
		//3.using files
		String data3="Today will complete files too";
		Path path=Paths.get("new.txt");
		Files.write(path, data3.getBytes());
		

		
		
		
	}

}
