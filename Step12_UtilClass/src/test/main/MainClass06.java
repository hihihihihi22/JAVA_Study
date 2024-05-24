package test.main;

import java.util.*;
import test.mypac.MemberDto;

public class MainClass06 {

	public static void main(String[] args) {
		//1.MemberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members라는 지역변수에 담아보세요.
		List <MemberDto> members = new ArrayList<>();
		//2. 3명의 회원정보를 MemberDto 객체에 각각 담아보세요.(MemberDto 객체가 3개 생성되어야함)
		MemberDto m1 = new MemberDto();
		//dto1.num=1; //필드에 직접 접근불가
		m1.setNum(1);
		m1.setName("개구리");
		m1.setAddr("연못");
		
		MemberDto m2 = new MemberDto(2,"개미","흙");
		MemberDto m3 = new MemberDto(3,"새","새집");
		//3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		//4.반복문을 이용해서 members 에 들어있는 회원정보를 출력해보세요.
//		for(int i=0; i<members.size();i++) {
//			System.out.println("번호:"+members.get(i).getNum()+", 이름:"+members.get(i).getName()+", 주소:"+members.get(i).getAddr());
//		}
		for(MemberDto tmp:members) {
			/*
			 * 	String 클래스의 format() 이라는 static 메소드를 이용하면
			 * 	원하는 문자열 형식을 좀 더 간편하게 얻어낼 수 있다.
			 *
			 *	%d => 숫자(정수)를 출력할때
			 *	%s => 문자를 출력할때
			 *	%f => 실수
			 *	%b => boolean
			 *	%% => %자체를 출력할때
			 */
			String info = String.format("번호:%d 	이름:%s	주소:%s",tmp.getNum(),tmp.getName(),tmp.getAddr());
			System.out.println(info);
		}
		
//		Object a = 1;
//		Object b = "kim";
//		Object c = members;
//		
//		test();
//		test("hi");
//		test("hi","hello");
		test("hi","hello","bye");
	}
	//테스트용 메소드
	public static void test(String... msg) {	//...은 가변인자
		//msg 는 String[] type 이다.
		for(String tmp:msg) {
			System.out.println(tmp);
		}
	}

}
