package review1110;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {

	public static void main(String[] args) {
		//�������� �ٷ�� ���׸� ���� ����
		Vector<Integer> v= new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		//Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it=v.iterator();//Iterator ��ü ���
		while(it.hasNext()){ //�ȿ� ���� ���� �ִٸ�
			int n= it.next();
			System.out.println(n);
		}
		
		//iterator�� �̿��Ͽ� ��� ���� ���ϱ�
		int sum=0;
		it =v.iterator(); //Iterator ��ü ���
		while(it.hasNext()) {
			int n=it.next();
			sum+=n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : "+sum);

	}

}
