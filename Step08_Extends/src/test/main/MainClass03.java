package test.main;
import test.mypac.*;

public class MainClass03 {

	public static void main(String[] args) {
		//아래의 3줄을 실행하면 참조값이 몇개가 나올까? (객체가 몇개가 생성될까?) : 1개
		HandPhone p1 = new HandPhone();
		//HandPhone type 안에 있는 값을 Phone type (부모 type) 변수에 대입가능!
		Phone p2 = p1;
		//HandPhone type 안에 있는 값을 Object type(부모 type) 변수에 대입가능!
		Object p3 = p1;
		
		//자식객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담긴다.
	}

}
