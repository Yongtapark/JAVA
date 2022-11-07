package reveiw1107;

public class Key {
	int number;

	Key(int number) {
		this.number = number;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey =(Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	

	@Override
	public int hashCode() {
		return number; // 왜 하필 넘버인가. 해쉬코드값... 그저 그냥 그게 넣기 가장 쉬워서?
	}

}
