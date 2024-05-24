package test.main;

import java.util.*;

public class MainClass10 {

	public static void main(String[] args) {
		//1. 세명의 회원정보(번호, 이름, 주소) 를 HashMap 객체를 생성해서 담아보세요
		//	HashMap 객체하나당 한명의 회원정보를 담으니깐 총 3개의 HashMap 객체가 형성이 되어야합니다.
		Map <String,Object> a1 = new HashMap<>();
		a1.put("num", 1);
		a1.put("name","가");
		a1.put("addr","a");
		
		Map <String,Object> a2 = new HashMap<>();
		a2.put("num", 2);
		a2.put("name","나");
		a2.put("addr","b");
		
		Map <String,Object> a3 = new HashMap<>();
		a3.put("num", 3);
		a3.put("name","다");
		a3.put("addr","c");
		
		//2. 위에서 생성한 HashMap 객체를 담을 ArrayList 객체를 생성해보세요.
		List<Map <String,Object>> members = new ArrayList<>();
		
		//3. ArrayList 객체에 HashMap 객체 3개를 담아보세요.
		members.add(a1);
		members.add(a2);
		members.add(a3);
		
		//4. 반복문 돌면서 ArrayList 에 담긴 회원정보를 콘솔창에 이쁘게 출력해보세요.
		for(Map<String, Object> tmp:members) {
			String info = String.format("번호:%d 이름:%s 주소:%s", (int)tmp.get("num"), (String)tmp.get("name"), (String)tmp.get("addr"));
			System.out.println(info);
		}
	}

}
