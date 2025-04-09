package FileReading;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReader1 {
	public static void main(String[] args) {
		File f1=new File("D:\\BubbleShorting.java");
		
		try (FileReader fr=new FileReader(f1);
			 BufferedReader br=new BufferedReader(fr)){
			int x=br.read();
			while(x!=-1) {
				System.out.print((char)x);
				x=br.read();
			}
			System.out.println("File Reading is completed!!");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
