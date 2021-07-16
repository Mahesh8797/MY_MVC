package FileConcepts;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
public class RandomAccessFiles {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("file.txt");
		
		String data="2447";
		RandomAccessFile rac=new RandomAccessFile(file,"rw");
		int seek=(int) rac.getFilePointer();
		rac.seek(seek);
		rac.write(data.getBytes());
		
		System.out.println(new String(readCharsFromFilePath(file,1,7)));
	}

	private static byte[] readCharsFromFilePath(File file, int i, int j) throws IOException {
		
		RandomAccessFile ra=new RandomAccessFile(file,"r");
		ra.seek(i);
		byte b[]=new byte[j];
	    ra.read(b);
		ra.close();
		return b;
	}

}
