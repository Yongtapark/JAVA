package review11116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
	        FileReader reader = new FileReader("src/review11116/sawonresult.txt");
	        
	        int ch;
	        while ((ch = reader.read()) != -1) {
	            System.out.print((char) ch);
	        }
			
		}catch (Exception e) {
			e.getStackTrace();
		}
	
	}

}
