package FileCreation;

import java.io.*;
import java.io.FileInputStream;

public class FileOutputStreamWriter {
	public static void main(String[] args) {
		File f1=new File("D:\\tanvir.txt");
		try (FileOutputStream fos=new FileOutputStream(f1,true)){
			fos.write("Create a File OutputStream\n".getBytes());
			fos.write("Tanvir Alam\n".getBytes());
			
			System.out.println("File Writing is completed");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
