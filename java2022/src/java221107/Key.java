package java221107;

/*
 * 1.hashCode()값 비교
 * 2. equals()를 비교
 * 1,2가 모두 같으면 같은 주소
*/
public class Key {

	public int number;

	public Key(int number){
		this.number=number;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		return number;
	}
}
