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
		return number; // �� ���� �ѹ��ΰ�. �ؽ��ڵ尪... ���� �׳� �װ� �ֱ� ���� ������?
	}

}
