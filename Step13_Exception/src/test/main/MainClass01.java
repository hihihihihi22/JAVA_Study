package test.main;

import java.util.*;

public class MainClass01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력:");
		//숫자형식의 문자열을 입력받는다. "10" "20" "10.1" 등등
		String inputNum = scan.nextLine();
		try {
		//입력한 숫자를(문자열) 실제숫자로 바꾼다.
		double num = Double.parseDouble(inputNum);
		//입력한 숫자에 100을 더한다.
		double result = num + 100;
		System.out.println("입력한숫자 + 100 :"+ result);
		} catch(NumberFormatException nfe) {
			/*
			 * 	실행스택에서 일어난 일을 콘솔창에 출력하기
			 * 	(자세한 예외정보를 예외객체가 콘솔창에 출력하게하기)
			 * 											*/
			nfe.printStackTrace();
		}
		System.out.println("무언가 중요한 마무리작업을 하고 main 메소드가 종료됩니다.");
	}

}
