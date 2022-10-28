package day09;

public class foreachEx {
	enum Week{월,화,수,목,금,토,일}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = { 1, 2, 3, 4, 5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
		int sum = 0;
		//기본형으로 변환
		for(int i =0; i<num.length;i++) {
			sum+=num[i];
		}

		// 아래 for-each에서 k는 num[0],num[1]...num[4]로 반복됨
		for (int k : num)
			sum += k;
			System.out.println("합은" + sum);

		// 아래 for-each에서 s는 names[0]....names[5]로 반복됨
			for(int i=0; i<6;i++) {
				System.out.print(i+":"+names[i]+" ");
			}
			System.out.println();
			int i=0;
		for (String s : names) {
			System.out.print((i++)+":"+s+ " ");
		//System.out.println();
		}

		// 아래 for-each에서 day는 월,화,수,목,금,토,일 값으로 반복됨
		for (Week day : Week.values())
			System.out.print(day + "요일");
		System.out.println();

	}

}
