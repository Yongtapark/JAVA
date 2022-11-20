package review11116;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class tets2 {

	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("c:\\windows\\system.ini");
		BufferedReader br =new BufferedReader(fr);
		String c;
		while((c=br.readLine())!=null) {
			System.out.println(c.toUpperCase());
		}
			

	}

}
