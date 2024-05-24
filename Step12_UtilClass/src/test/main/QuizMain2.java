package test.main;

import java.util.*;
import java.util.random.*;

public class QuizMain2 {
	public static void main(String args[]) {
		//1. 로또번호를 담을 HashSet 객체를 생성해서 set1 이라는 지역변수에 담아보세요
		Set<Integer>set1 = new HashSet<>();
		
		//2. while 문을 이용해서 랜덤한 로또번호를 set1에 반복적으로 담아보세요
		//	 while 문 탈출조건은 set1.size()가 6이되면 탈출되도록 해보세요.
		Random ran = new Random();
		while(set1.size() < 6) {
			set1.add(ran.nextInt(1,45));}
		List<Integer>result = new ArrayList<>(set1);
		
		//3. set1에 담긴번호를 오름차순 정렬해서 콘솔창에 모두 출력해보세요.
		Collections.sort(result);
		for(Integer tmp:result)
			System.out.print(tmp+" ");
	}
}
