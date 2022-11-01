package java221101.copy;

import java221101.A;

public class C {
	A a1 = new A(true); // public(o)
//A a2= new A(1);	//default
//A a3= new A("문자열");//private // 싱글톤패턴으로 만들어서 접근해야함.
	A a4 = A.getInstance("문자열"); // 싱글톤패턴
}
