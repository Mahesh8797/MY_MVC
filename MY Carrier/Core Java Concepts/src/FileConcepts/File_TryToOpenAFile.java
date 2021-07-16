package FileConcepts;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
public class File_TryToOpenAFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file=new File("file.txt");
		
		if(!Desktop.isDesktopSupported())
		{
			System.out.println("Desktop not supported");
		}
		Desktop desk=Desktop.getDesktop();
		if(file.exists())
		{
			desk.open(file);
		}
		File f=new File("Maheshwari_Resume.pdf");
		if(f.exists())
		{
			desk.open(f);
		}
		
		File fw=new File("java.xlsx");
		if(fw.exists())
		{
			desk.open(fw);
		}
	}

}
