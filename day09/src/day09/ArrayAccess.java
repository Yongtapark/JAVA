package day09;

import java.util.Scanner;

public class ArrayAccess {
	/*
	  배열 1.배열이란 크기와 성격이 같은 일련의 원소들이 모여 공동의 집합 구조를 갖는 자료의 집합체를 의미하는 것으로 동질적인 성격을 가진
	  자료들에 대해 개별적으로 자료형(Data Type)을 부여하지 않고 하나의 이름을 가지고 처리할 목적으로 사용한다.
	  
	  2. 자바에서의 배열은 다음과 같은 순서에 의해 사용된다. 배열선언 => 배열에 메모리 할당 => 배열 요소의 이용
	  
	  
	  형식 및 구조 
	  	자료형[] 변수명; 
	  	변수명 = new자료형[요소크기] 
	  	변수명[인덱스]=값;
	  기본형 배열의 초기값
	  	문자형 : \u0000
	  	정수형 : 0
	  	실수형 : 0.0
	  	불형 : false
	  객체=참조형배열 초기값 : null
	  
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		for(int i= 0; i<intArray.length;i++) {
			System.out.println("intArray["+i+"]="+intArray[i]);
		}
		
		System.out.println("5개의 숫자를 입력하세요");

		for (int i = 0; i < 5; i++) {
			intArray[i] = in.nextInt();
		System.out.println("intArray["+i+"]="+intArray[i]);
			if (intArray[i] > max)
			max = intArray[i];
			System.out.println("max ="+max);
	
			
			
		}
		System.out.println("입력된 수에서 가장 큰 수는" + max + "입니다.");
	}

}
