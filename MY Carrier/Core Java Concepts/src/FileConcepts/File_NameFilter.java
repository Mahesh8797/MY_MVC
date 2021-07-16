package FileConcepts;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
public class File_NameFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dir="File";
		String ext=".txt";
		findFiles(dir,ext);
	}
	
	public static void findFiles(String dir, String ext)
	{			
		File file=new File(dir);
		if(!file.exists())
		{
			System.out.println("does not exists");
			
		}
		
		// first approach
		File[] fs=file.listFiles((d,s)->{ return s.toLowerCase().endsWith(ext);});
		for(File files : fs)
		{
			System.out.println("File exists : "+files.getName());
		}
		
		//second approach
		File[] f=file.listFiles(new MyFilter(ext));
		if(f.length==0)
		{
			System.out.println("does not exists");
		}
		else
		{
			for(File files : f)
			{
				System.out.println("File exists : "+files.getName());
			}
		}
				
	}

}
class MyFilter implements FilenameFilter
{
	String ext;
	MyFilter(String ext)
	{
		this.ext=ext;
	}
	@Override
	public boolean accept(File arg0, String arg1) {
		
		return arg1.toLowerCase().endsWith(ext);
	}
	
}