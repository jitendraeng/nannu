package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class File_Create_Read_Write {

	public static void main(String[] args) {

		File f=new File(".\\src\\test\\resources\\jitendra1.txt");
		try {
			if(f.createNewFile()) {
				
				System.out.println("successfully created file "+f.getName());
				
			}else {
		        System.out.println("File already exists.");
		      }
		} catch (IOException e) {
			 System.out.println("An error occurred.");
			e.printStackTrace();
		}

		 try {
	            File dir = new File(".\\src\\test\\resources");
	            dir.mkdirs(); // ensure directory exists
	            
	            File file = new File(dir, "jitendra1.txt");
	            FileWriter fin = new FileWriter(file);
	            fin.write("ram ram ram ram");
	            fin.close();
	            
	            System.out.println("Successfully wrote to file: " + file.getAbsolutePath());
	        } catch (IOException e) {
	            System.out.println("Error occurred");
	            e.printStackTrace();
	        }
		

		try {
			File fr = new File(".\\src\\test\\resources\\jitendra1.txt");
			Scanner fileread = new Scanner(f);

			while (fileread.hasNextLine()) {

				String value = fileread.nextLine();

				System.out.println(value);

			}

		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}