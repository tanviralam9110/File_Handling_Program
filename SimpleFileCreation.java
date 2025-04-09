package FileCreation;

import java.io.File;

public class SimpleFileCreation {
	public static void main(String[] args) {
		File f1=new File("D:\\abcd.txt");
		try {
			System.out.println(f1.createNewFile());
			System.out.println("File is created");
		} catch (Exception e) {
			System.out.println("File is not created");
			System.out.println(e.getMessage());
			
		}
		System.out.println("=======Program Ends============");
	}

}
