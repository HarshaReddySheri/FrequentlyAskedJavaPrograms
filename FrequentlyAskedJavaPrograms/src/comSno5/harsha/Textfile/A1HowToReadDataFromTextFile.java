package comSno5.harsha.Textfile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;


public class A1HowToReadDataFromTextFile {
	
	public class Approach1UsingFileReader_BufferedReader{
		public static void main(String[] args)throws IOException {
			FileReader fr = new FileReader("D:/javaTelugu/simple.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
			br.close();
		}
	}
	
	
	public class Approach2UsingScannerFile{
		public static void main(String[] args) throws IOException {
			File file = new File("D:/javaTelugu/simple.txt");
			Scanner sc = new Scanner(file);
			
			//loopStatement
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		}
	}
	
	public class Approach3UsingSannerFile{
		public static void main(String[] args) throws IOException {
			File file = new File("D:/javaTelugu/simple.txt");
			Scanner sc = new Scanner(file);
			sc.useDelimiter("//Z");
			System.out.println(sc.next());
			
			sc.close();
		}
	}
}
