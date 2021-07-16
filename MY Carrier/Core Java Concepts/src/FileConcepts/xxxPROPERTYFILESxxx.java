package FileConcepts;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class xxxPROPERTYFILESxxx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties p=new Properties();
		OutputStream os=new FileOutputStream("db.properties");  //creating an object to store the values and mentioning the file
		
		p.setProperty("url", "oracel/db:3360");
		p.setProperty("user", "mahe");
		p.setProperty("pass", "yoge");
		
		p.store(os, null);  //stores the values when we run the program
		
		InputStream is=new FileInputStream("db.properties");
		p.load(is);   //loads all the data form the file
		
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("pass"));
		
		p.list(System.out);   //list all the data in the file
	}

}
