package test.mypac;
/*
 * [메소드를 만들때 고려 해야 하는것]
 * 
 * 1. 접근지정자 (모르면 public)
 * 2. static or non static (모르면 non static)
 * 3. 리턴 type (모르면 void)
 * 4. 메소드명
 * 5. 메소드에 전달하는 인자의 갯수와 데이터 type
 */
public class test {
//public or default or protected or private
//void  어떤 type 데이터로 return 할지
	public void walk() {
		System.out.println("걸어요!");
	}
	public int getNumber() {
		int num = 10;
		return num;
	}
	
	//인사말을 리턴하는 메소드를 완성해보세요.
	public String getGreeting() {
		return "안녕하세요!";
	}
	//동일한 패키지 안에 있는 AirPlane type 을 리턴해주는 메소드
	public AirPlane getPlane() {
		//AirPlane 객체를 생성해서 참조값을 fly에 담고
		AirPlane fly = new AirPlane();
		return fly;//변수에 담긴 값을 리턴해 준다.
		//return new AirPlane();
	}
	//int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		System.out.println();
	}
	//String type 을 메소드의 인자로 전달 받는 메소드
	public void setName(String name) {
		System.out.println();
	}
	//AirPlane type 을 메소드의 인자로 전달 받는 메소드
	public void setPlane(AirPlane plane) {
		System.out.println();
	}
	//int type, String type, Airplane type 세개를 선달 받는 메소드
	public void doSomething(int num, String name, AirPlane plane) {
		
	}
	/*
	 * - 동일한 메소드명으로 여러개의 메소드가 정의되어 있음
	 * - 메소드가 다중정의 되어있다.
	 * - 메소드가 오버로딩(overloading) 되어있다.
	 * */
	
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	public void send(int num) {
		System.out.println(num+"을 전송해요");
	}
	public void send(String name) {
		System.out.println(name+"을 전송해요");
	}
	public void send(AirPlane plane) {
		System.out.println("비행기를 전송해요");
	}
}
