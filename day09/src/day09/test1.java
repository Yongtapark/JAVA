package day09;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test[] = new int[] { 4, 7, 9, 1, 3, 2, 5, 6, 8 };

		System.out.println("배열 요소 전체 출력");
		for (int i = 0; i < test.length; i++) {

			System.out.print(test[i] + " ");
		}
		System.out.println();

		System.out.println("짝수 선택적 출력");
		for (int i = 0; i < test.length; i++) {

			if (test[i] % 2 == 0) {
				System.out.print(test[i] + " ");
			}

		}
		System.out.println();

		System.out.println("3의 배수 선택적 출력");
		for (int i = 0; i < test.length; i++) {

			if (test[i] % 3 == 0) {
				System.out.print(test[i] + " ");
			}

		}
		System.out.println();

	}

}
