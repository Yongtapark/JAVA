package review1110;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		//���ڿ��� ���� ������ ArrayList �÷��� ����
		ArrayList<String> a=new ArrayList<String>();
		
		// Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner sc= new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("�̸��� �Է��ϼ���>>");
			String s=sc.next();
			a.add(s);//ArrayList �÷��ǿ� ����
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i=0; i<a.size();i++) {
			//ArrayList�� i��° ���ڿ� ������
			String name =a.get(i);
			System.out.println(name+" ");
		}
		//���� �� �̸��� ���
		int longestIndex =0;
		for(int i=1; i<a.size();i++) {
			if(a.get(longestIndex).length()<a.get(i).length()) {
				longestIndex = i;
			}
			
		}
		System.out.println("\n ���� �� �̸���"+a.get(longestIndex));
	}

}