package java221107;

public class test2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int i;

		System.out.println("**로또 추첨을 시작합니다.**");

		for (i = 0; i < 6; i++) {
			lotto[i] = getnumber();
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i]+" ");
		}
	}

	public static int getnumber() {
		return (int) (Math.random() * 45 + 1);
	}
}