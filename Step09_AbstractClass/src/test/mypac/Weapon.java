package test.mypac;

//미완성된 추상메소드를 멤버로 가지고있는 클래스는 abstract 예약어를 붙여서 정의해야한다.
public abstract class Weapon {
	//무기작동을 준비하는 메소드
	public void prepare() {
		System.out.println("무기작동을 준비합니다.");
	}
	//공격을 하는 메소드의 모양만 정의하고 실제구현은 하지않기
	//미완성된 추상메소드를 만들때는 abstract 예약어가 필요하다.
	public abstract void attack();
}
