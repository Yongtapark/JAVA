package review11116;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;
import java.util.Calendar;

public class sawonsibal {

	public static void main(String[] args) throws IOException {
		File file1 = new File("src/review11116/sawon.txt");
		File file2 = new File("src/review11116/sawonresult.txt");

		try {
			FileReader fr = new FileReader(file1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(file2);
			PrintWriter pw = new PrintWriter(fw);
			
			Calendar ca=Calendar.getInstance();
		    int year=ca.get(Calendar.YEAR);
		    int mon =ca.get(Calendar.MONTH);
		    int day =ca.get(Calendar.DATE);
		    pw.println("\t\t2022년 신입사원 평가 점수");
		    pw.println("---------------------------------");
			pw.println("\t\t\t\t평가일"+year+"년"+mon+"월"+day+"일");
			pw.println("---------------------------------");
			pw.println("이름 java  jquery  html5 total avg");
			pw.println("---------------------------------");
			while (true) {
				String line = br.readLine();
				if (line == null)
					break;
				String[] str = line.split(",");
				String name = str[0];
				String c = "";
				int total = 0;
				for (int i = 1; i < str.length; i++) {
					
					total += Integer.parseInt(str[i]);
					c += str[i] + "    ";
					
					
					
				}
				double avg=total/3;
				
				pw.println(name+" "+c+" "+total+"  "+avg);
				pw.println("---------------------------------");
				
			
				
			}
			
			pw.close();
			fw.close();
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
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
