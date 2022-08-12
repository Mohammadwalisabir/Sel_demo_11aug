package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalOutput {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\razia\\Dropbox\\My PC (LAPTOP-BKR18EGK)\\Downloads\\OutPut.txt");
		
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.print("Another How are you");
		printWriter.close();
	}

}
