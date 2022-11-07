package java221104;

public class EatExample {

	public static void main(String[] args) {
		Person per =new Man();
		int active =(int) (1+Math.random()*10);
		Man man=(Man) per;
		int life=1;
		while(life!=0){
		if(active==1) {
		man.eat();
		}
		//man.poop();
		//man.sleep();

	}

}}
