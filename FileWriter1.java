package FileCreation;

import java.io.*;

public class FileWriter1 {
	public FileWriter1(File f1, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		File f1=new File("D:\\abc.txt");
		try (FileWriter fw= new FileWriter(f1,true)) {
			fw.write("\nHello File Writer");
			fw.write("\nMy name is Md Tanvir Alam");
			System.out.println("\n Hello Java");
			System.out.println("File is created");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}

}
