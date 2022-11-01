package java1028;

public class Book2 {
	//인스턴스멤버변수:객체 생성 후 객체명.필드로 접근,객체마다 개별값
	String title;
	String author;
	int ISBN;
	
	public Book2(String title, String Author, int ISBN) {
		this.title=title;
		this.author=author;
		this.ISBN = ISBN;
		System.out.println("인자 3개 호출");
	}
	public Book2(String title,int ISBN) {
		this(title,"anonymous",ISBN);// 3개짜리로 가서 인자3개 호출 인출
		System.out.println("인자 2개 호출");//그 다음 2개 호출
	}
	public Book2() {
		this(null,null,0);// 인자3개 호출 무조건 첫줄에 와야함
		System.out.println("생성자가 호출되었음"); //그다음 호출 
	}
	
	public static void main(String[]args) {
		Book2 javaBook=new Book2("자바","황기태",333);
		Book2 holyBible=new Book2("Holy Bible",1);
		Book2 emptyBook=new Book2();

		System.out.println("책제목 :"+javaBook.title);
		System.out.println("저자 :"+javaBook.author);
		System.out.println("바코드 :"+javaBook.ISBN);
		
		
	}//main
}
