package FileConcepts;

import java.io.File;
import java.io.IOException;

public class File_DeleteAFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		//1. deleting a file which we creaed
		File file=new File("file.txt");		
		if(file.delete())
		{
			System.out.println("file deleted ");
			
		}
		else
		{
			System.out.println("file does not exists ");		
		}
		//2. deleting a empty directory
		file=new File("del");
		if(file.delete())
		{
			System.out.println("Direcotry deleted ");
			
		}
		else
		{
			System.out.println("Directory is not empty or does not exists ");		
		}
		
		//3. trying to delete a non empty directory will not delete
		file=new File("tmp");
		if(file.delete())
		{
			System.out.println("Direcotry deleted ");
			
		}
		else
		{
			System.out.println("Directory is not empty or does not exists ");		
		}
		
	}

}
