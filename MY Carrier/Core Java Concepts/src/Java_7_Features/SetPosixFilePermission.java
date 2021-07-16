package Java_7_Features;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

public class SetPosixFilePermission {

	public static void main(String[] args)
	{
		File file=new File("new folder/file.txt");
		file.setExecutable(false);
		file.setReadable(true);
		file.setWritable(true);
		//only for owners
		file.setExecutable(true, true);
		file.setWritable(false, true);
		file.setReadable(true, true);
		
		//using PosixfilePermission
		Set<PosixFilePermission> perms=new HashSet<PosixFilePermission> ();
		perms.add(PosixFilePermission.OWNER_READ);
		perms.add(PosixFilePermission.OWNER_WRITE);
		perms.add(PosixFilePermission.OWNER_EXECUTE);
		
		perms.add(PosixFilePermission.GROUP_READ);
		perms.add(PosixFilePermission.GROUP_WRITE);
		perms.add(PosixFilePermission.GROUP_EXECUTE);
		
		perms.add(PosixFilePermission.OTHERS_READ);
		perms.add(PosixFilePermission.OTHERS_WRITE);
		perms.add(PosixFilePermission.OTHERS_EXECUTE);
		
		try
		{
		Files.setPosixFilePermissions(Paths.get("new folder/file.txt"), perms);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
