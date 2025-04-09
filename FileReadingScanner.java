package FileReading.withScanner;

import java.io.File;
import java.util.Scanner;

public class FileReadingScanner {
	public static void main(String[] args) {
		File f1=new File("D:\\BubbleShorting.java");
		try (Scanner sc=new Scanner(f1)){
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("ssssssssssssssssssssssssssssssssssssssssssssss");
			System.out.println("Reading is completed");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
