package java1027;

public class ArrayParameter {
	 static void increase(int[]array) {//(가)
	for(int i=0; i<array.length;i++){
		array[i]++;
	}
}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		increase(a);//(가)로 이동, static이기 때문에 그냥 increase(a)해도 가능
		//static이 안붙으면 뭘로 호출? 객체를 만들어 호출 ArrayParameter arr =new ArrayParameter();
 		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
