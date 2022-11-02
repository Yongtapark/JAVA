package java221102test;

public class ConversationBook extends Book {
private String language;

	public ConversationBook(int productID, String description, String maker, int price
			,int ISBN ,String title, String author,String language) {
		super(productID, description, maker, price,ISBN,title,author);
		
		this.setLanguage(language);
	}
	public void setLanguage(String language) {
		this.language=language;
	}
	@Override
	public void showInfo() {
		System.out.println("언어>>"+language+"\n");
	}
	
}
