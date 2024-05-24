package test.main;

import java.util.*;
import test.mypac.*;

public class MainClass05 {
	public static void main(String[] args) {
		//1. Member 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members라는 지역변수에 담아보세요.
		List<Member> members = new ArrayList<>();
		//2. 3명의 회원정보를 Member 객체에 각각 담아보세요. (Member 객체가 3개 생성되어야함)
		Member m1 = new Member(1,"메로나","메론마을");
		Member m2 = new Member(2,"누가바","누가마을");
		Member m3 = new Member(3,"보석바","보석마을");
		//3. 위에서 생성된 Member 개게의 참조값을 ArrayList 객체에 모두담아보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		/*
		 * 4. member List 객체에 담긴 내용을 이용해서 회원목록을 아래와같은 형식으로
		 * 반복문 돌면서 출력해 보세요.
		 * 
		 * 번호:1, 이름:김구라, 주소: 노량진
		 * 번호:2, 이름:해골, 주소: 행신동*/
		for(int i=0;i<members.size();i++) {
			System.out.println("번호:"+members.get(i).num+", 이름:"+members.get(i).name+", 주소:"+members.get(i).addr);
		}
		
//		for(Member tmp:members) {
//			String info = "번호:"+tmp.num+", 이름:"+tmp.name+", 주소:"+tmp.addr;
//			System.out.println(info);
//		}
	}
}
