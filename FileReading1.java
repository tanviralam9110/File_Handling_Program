package FileReading;

import java.io.File;
import java.io.FileReader;

public class FileReading1 {
	public static void main(String[] args) {
		File f1=new File("D:\\BubbleShorting.java");
		try (FileReader fr=new FileReader(f1)){
			int x=fr.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=fr.read();
			}
			System.out.println("File Reading is completed!!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
