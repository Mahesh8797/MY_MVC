package StringConcepts;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ByteToStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="MAHESHWARI";
		String s2="meriharta";
		byte[] b1=s1.getBytes(StandardCharsets.UTF_8); //passing the charset parameter is optional
		byte[]b2=s2.getBytes();
		System.out.println("converting caps "+Arrays.toString(b1));
		System.out.println("converting small "+Arrays.toString(b2));

		
		byte[]b3={'A','B','C','D','E'};
		byte[]b4={65,66,67,68,69};
		String s3=new String(b3);
		String s4=new String(b4);
		System.out.println("checking equality "+s3);
		System.out.println("checking equality "+s4);
		
		}
	}


