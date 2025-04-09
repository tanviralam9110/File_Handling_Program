package FileCreation;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class BufferedOutputStreamWriter {
	public static void main(String[] args) {
		File f1=new File("D:\\tanvir.txt");
		try (FileOutputStream fos=new FileOutputStream(f1,true);
				BufferedOutputStream bos=new BufferedOutputStream(fos)){
			bos.write("Create a File OutputStream\n".getBytes());
			bos.write("Tanvir Alam\n".getBytes());
			
			System.out.println("File Writing is completed");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
