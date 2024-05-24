package test.main;
import test.mypac.*;
/*
 * 	[추상클래스 (Abstract Class)]
 * 
 * 	-class 예약어 앞에 abstract 를 명시해서 클래스를 정의한다.
 * 	-형태만 정의되고 실제구현은 되지않은 메소드가 존재할 수 있다.
 * 	-형태만 정의된 메소드를 만들때는 abstract 예약어를 붙어서 메소드를 정의한다.
 * 	-생성자는 존재하지만 단독으로 객체생성은 불가하다.
 * 	-추상클래스 type 의 참조값이 필요하다면 추상클래스를 상속받은 자식클래스를 정의해서 객체생성한다.
 * 	-추상클래스를 상속받은 자식클래스는 부모의 추상메소드를 모두 오버라이드(재정의)해야한다.*/
public class MainClass01 {

	public static void main(String[] args) {
		//추상(abstract)클래스로 객체를 생성할수있을까?
		//Weapon w1 = new Weapon(); //추상클래스 단독으로 객체생성불가!
		
		//단지 data type 의 역할은 할수가 있을까?
		Weapon w1 = null;//data type 의 역할은 할 수 있다.
		//w1.prepare(); //null 이라 참조값이 없어서 작동이안됌. NullPointerException 발생
		
		//Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체를 생성해서 Weapon type 의 참조값 얻어내기
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}

}
