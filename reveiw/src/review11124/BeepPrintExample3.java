package review11124;

import java.awt.Toolkit;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Toolkit toolkit =Toolkit.getDefaultToolkit();
		for(int i=0; i<5;i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		for(int i=0; i<5;i++) {
			System.out.println("thing");
		try {
			Thread.sleep(500);
		}catch (Exception e) {
			// TODO: handle exception
		}
		}

	}

}
