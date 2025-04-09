package FileCreation;

import java.io.*;

public class BufferedWriter1 {
	public static void main(String[] args) {
		File f1=new File("D:\\tanvir.txt");
		try (FileWriter fw=new FileWriter(f1, true);
			BufferedWriter bw=new BufferedWriter(fw)){
			bw.write("Buffered Writer is created");
			System.out.println("File is created");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
