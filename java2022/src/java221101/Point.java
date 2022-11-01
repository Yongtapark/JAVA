package java221101;

public class Point {
	int x,y; 
	void set(int x, int y){//한 점을 구성하는 x,y좌표
	this.x =x;
	this.y=y;
	}
	void showPoint(){
		System.out.println("("+x+","+y+")");
	}
}
