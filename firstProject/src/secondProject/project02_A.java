package secondProject;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class project02_A {
	
	public static void main(String[]args) {
		String URL ="https://www.dogdrip.net/dogdrip";
		Document doc=null;
		try {
			doc=Jsoup.connect(URL).get();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		Elements element =doc.select("tbody");
		


		System.out.println("===================================");
		for(Element el:element.select("tr")) {
			System.out.println(el.text());
		}
		System.out.println("====================================");
		
		
	}
}
