package FileCreation;

import java.io.File;

public class FileCreated {
	public static void main(String[] args) {
		File f1=new File("D:\\abc.txt");
		try {
			if(!f1.exists())
				System.out.println("File is  Created");
			else
				System.out.println("file is already available");
		} catch (Exception e) {
			System.out.println("File is not Created");
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
