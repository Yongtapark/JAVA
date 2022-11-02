package java221102test;

public class CompacDisc extends Product {
	private String albumTitle;// 앨범제목
	private String artist;// 가수이름 정보

	public CompacDisc(int productID, String description, String maker, int price, String albumTitle, String artist) {
		super(productID, description, maker, price);
		this.albumTitle = albumTitle;
		this.artist = artist;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("앨범 제목>>"+albumTitle);
		System.out.println("가수>>"+artist);
	}
}
