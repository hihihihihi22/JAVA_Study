package test.main;

import java.util.Random;

public class QuizMain {

	public static void main(String[] args) {
		//String type 이 저장되어있는 배열
		String[] data = {"cherry", "apple", "banana", "melon","7"};
		//배열에 저장된 문자열중에 1개가 랜덤하게 콘솔창에 출력되도록 프로그래밍 해보세요.
		Random ran = new Random();
		int i = ran.nextInt(1,5); //그냥 5라도 적어도됌 0~4

		System.out.println(data[i]);
	
	}

}
