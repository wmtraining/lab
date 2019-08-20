package test;

import java.io.BufferedReader;
import java.io.FileReader;

//TODO read file using BufferedReader
// close all file handle in finally block
public class FileTest {
	public static void main(String args[]) {
		try {
			FileReader fis = new FileReader("c:\\Temp\\sample.txt");

			//TODO
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}