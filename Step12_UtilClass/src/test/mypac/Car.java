package test.mypac;

public class Car {
	//필드
	private String name;
	//생성자
	public Car(String name) {
		//생성자의 매개변수에 전달된 차의 이름을 필드에 저자한다.
		this.name = name;
	}
	//메소드
	public void drive() {
		System.out.println(name + "이(가) 달려요!");
	}
}
