package test.main;

public class MainClass04 {

	public static void main(String[] args) {
		//1. String type 을 담을수있는 방3개짜리 빈 배열객체를 만들어서 참조값을 지역변수 names에 담기
		String[] names = new String[3];
		//2. 3개의방에 순서대로 친구의 이름을 담아보세요.
		names[0] = "오리"; names[1]="거위"; names[2]="병아리";
		//3. 배열에 들어있는 친구의 이름을 for 문을 이용해서 하나씩 순서대로 콘솔창에 출력해보세요.
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
