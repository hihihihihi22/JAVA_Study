package test.main;
import test.mypac.*;

public class MainClass06 {

	public static void main(String[] args) {
		//HandPhone 객체 하나 있다고 가정하기
		HandPhone p1 = new HandPhone();
		
		//안드로이드 폰이 필요하다고해서 핸드폰 객체로 안드로이드 폰을 만들 수 있을까?
		AndroidPhone p2 = (AndroidPhone)p1;//ClassCastException 발생!
		
		//이게 가능할까?
		p2.doInternet();
	}

}
