package test.main;

import java.util.*;

import test.mypac.Car;

public class MainClass09 {

	public static void main(String[] args) {
		//HashMap 객체생성해서 참조값을 Map 인터페이스 type 지역변수에 담기
		Map<String, Object> map1 = new HashMap<>();
		map1.put("num",1);	//Integer type 담기
		map1.put("name","김구라"); //String type 담기
		map1.put("isMan",true); //Boolean type 담기
		map1.put("car", new Car("소나타")); //Car type 담기
		
		/*
		 * value 의 Generic 클래스가 Object 로 지정되어 있기때문에
		 * 리턴되는 Object type 을 원래 type 으로 casting 해야한다.
		 */
		int num = (int)map1.get("num");
		String name = (String)map1.get("name");
		boolean isMan = (boolean)map1.get("isMan");
		Car car = (Car)map1.get("car");
		
		//동일한 key 값으로 다시 담으면 수정
		map1.put("name", "에이콘");
		//특정 key 값으로 담긴내용삭제, 성공하면 true, 실패하면 false 리컨
		map1.remove("isMan");
		//모두삭제
		map1.clear();
	}

}
