package FileReading;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamreading {
	public static void main(String[] args) {
		
		File f1=new File("D:\\BubbleShorting.java");
		
		try(FileInputStream fis=new FileInputStream(f1)) {
			int x=fis.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fis.read();
			}
			System.out.println("===============================================================");
			System.out.println("File reading is completed");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
