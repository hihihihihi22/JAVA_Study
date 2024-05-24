package test.main;

import java.util.ArrayList;

public class MainClass01 {

	public static void main(String[] args) {
		//java 에서 배열은 용도가 한정되어있다.	item 을 담을 수 있는 공간을 늘이거나 줄일 수 없다.

		//문자열(String) type 을 담을 수 있는 방 5개짜리 배열객체생성
		String[] names = new String[5];
		names[0] = "김구라";
		names[1] = "해골";
		names[2] = "원숭이";
		
		//String type 을 순서대로 저장할 수 있는 ArrayList 객체생성하고 참조값을 friends 에 담기
		ArrayList<String> friends = new ArrayList<>();
		friends.add("김구라");
		friends.add("해골");
		friends.add("원숭이");
		
		//0번방의 아이템을 불러와서 item 이라는 변수에 담아보세요
		String item = friends.get(0);
		//1번방의 아이템을 삭제하려면?
		friends.remove(1);
		//0번방에 "에이콘"을 넣고(끼워넣기)싶으면?
		friends.add(0, "Acorn");
		//저장된 아이템의 갯수(size)를 size 라는 지역변수에 담아보세요.
		int size = friends.size();
		//저장된 모든아에템 전체삭제
		friends.clear();
		//friends.removeAll(friends);
	}

}
