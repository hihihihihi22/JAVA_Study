package test.main;
import test.mypac.Square;
public class MainClass08 {

	public static void main(String[] args) {
		//2개의 객체를 생성해서
		Square aa = new Square();
		Square bb = new Square();
		
		//각각의 필드에 다른 값을 담을수도 있다
		aa.a=10;
		aa.b=10;
		
		bb.a=20;
		bb.b=20;
		
		//메소드를 호출해보면 각각 넓이다르다는것을 알수있음
		aa.showArea();
		bb.showArea();
	}

}
