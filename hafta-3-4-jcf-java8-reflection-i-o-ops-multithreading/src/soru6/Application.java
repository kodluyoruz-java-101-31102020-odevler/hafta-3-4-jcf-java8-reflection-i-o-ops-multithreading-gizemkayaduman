package soru6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		

		System.out.print("Öğrenci Numaranızı Giriniz: ");
		Scanner scanner = new Scanner(System.in);
		String studentNo = scanner.next();
		System.out.print("Adınızı Giriniz: ");
		String studentName = scanner.next();
		System.out.print("Soyadınızı Giriniz: ");
		String studentSurname = scanner.next();
		System.out.print("Yaşınızı Giriniz: ");
		String studentAge = scanner.next();
		System.out.print("Bölümünüzü Giriniz: ");
		String studentSection = scanner.next();

		String externalFilePath = "C:/Users/fehat/Desktop/context.txt";
		File externalFile = new File(externalFilePath);
		FileOperations.write(externalFile, studentNo,studentName,studentSurname,studentAge,studentSection);
		
		FileInputStream inputStream = new FileInputStream(externalFilePath);
		String externalModifiedFileContent = FileOperations.read(inputStream);

		
		readFile();
	}	
		public static void readFile() throws FileNotFoundException {
			String externalFilePath = "C:/Users/fehat/Desktop/context.txt";
			FileInputStream inputStream = new FileInputStream(externalFilePath);
			String externalModifiedFileContent = FileOperations.read(inputStream);
			System.out.println("dosya içeriği:");
			System.out.println(externalModifiedFileContent);
		}
	
	

}
