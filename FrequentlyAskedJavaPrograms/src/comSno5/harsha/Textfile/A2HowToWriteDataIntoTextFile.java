package comSno5.harsha.Textfile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A2HowToWriteDataIntoTextFile {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("D:/javaTelugu/simple.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium with java ");
		bw.write("Selenium with python ");
		bw.write("Selenium with C# ");
		System.out.println("Finished!!!!");
		bw.close();
		
		
	}
}
