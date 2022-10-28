package java1027;

import java.util.Random;
import java.util.Scanner;

public class test11027 {

	public static void main(String[] args) {
		Random rand =new Random();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("요소 수");
		int n=sc.nextInt();
		int[]a=new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=1+rand.nextInt(100);
			System.out.println("a["+i+"]="+a[i]);
		}
		int temp=0; //n/2 //나누기 2를 하지않으면 수가 한바퀴를 돌아 모두 제자리로 돌아온다.
		for(int i=0;i<n/2;i++) {//(n-1)-i;i++
			temp =a[i];
			a[i] =a[n-1-i];
			a[n-1-i]=temp;
			System.out.println();
			
		}
		System.out.println("요소 반대");
		
		for(int i=0; i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
