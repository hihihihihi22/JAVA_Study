package test.main;
/*
 * 	run 했을때 콘솔창에 경과시간이 출력되는 프로그래밍을 해보세요.
 * 
 * 0분 1초
 * .
 * .
 * 1분 0초
 * .
 * .
 * 2분 0초											*/
public class QuizMain {
	public static void main(String[] args) {
		int num = 0; 
		int num2 = 0;
		
		while(true){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(num2==60) {
			num2=0;
			num++;
		}
		System.out.println(num+"분 "+num2+"초");
		num2++;
		}
	}

}
