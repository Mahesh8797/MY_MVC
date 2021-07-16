package FileConcepts;

import java.io.File;
import java.io.IOException;

public class File_CreateNewwDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("new folder");
		System.out.println(file.mkdir());
		File f=new File("new folder/hi.txt");
		if(f.createNewFile())
		{
			System.out.println("file created");	
		}
	}

}
