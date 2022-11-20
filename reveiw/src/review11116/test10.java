package review11116;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("src/review11116/test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String c;

		while ((c = br.readLine()) != null) {
			if (c.equals("0")) {
				break;
			}
			bw.write(c);
			bw.newLine();

			bw.flush();

		}
		bw.close();

	}

}
