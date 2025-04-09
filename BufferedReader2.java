package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReader2 {
	public static void main(String[] args) {
		File f1=new File("D:\\BubbleShorting.java");
		
		try (FileReader fd=new FileReader(f1);
			 BufferedReader br=new BufferedReader(fd)){
			
			String str=br.readLine();
			while(str!=null) {
			System.out.println(str);
			str=br.readLine();
			}
			System.out.println("Reading is completed");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}
