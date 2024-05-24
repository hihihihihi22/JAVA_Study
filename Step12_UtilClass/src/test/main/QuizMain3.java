package test.main;

import test.mypac.*;
import java.util.*;

/*
 * 	1. PostDto 클래스를 만들어보세요
 *     PostDto에는 글번호, 작성자, 제목을 담을 수 있어야합니다.
 *     즉, 3개의 필드를 만드세요.
 *     필드명은 마음대로. 필드의 Data Type 은 잘 생각해서 결정
 *     Dto 작성규약에 맞게 만들어주세요( eclipse generate 기능활용) 
 *     test.mypac 패키지에 만들기
 *     
 *  2. PostDto 객체에 임의의 글3개의 정보를 담아보세요.
 *     총 3개의 PostDto 객체가 생성이 되어야합니다.
 *  
 *  3. PostDto 객체를 담을 수 있는 ArrayList 객체를 생성해서, 
 *     위에서 생성한 PostDto 객체를 ArrayList 에 담아보세요
 *  
 *  4. 반복문 돌면서 ArrayList 에 담긴 글목록을 콘솔창에 이쁘게 출력해보세요.	*/

public class QuizMain3 {
	public static void main(String[] args) {
		PostDto post1 = new PostDto(1,"지나가는 고양이","간식리필좀");
		PostDto post2 = new PostDto(2,"날아가던 갈매기","새우깡 달라");
		PostDto post3 = new PostDto(3,"평범한 강아지","왈왈");
		
		List<PostDto> post = new ArrayList<>();
		post.add(post1);
		post.add(post2);
		post.add(post3);
		
		for(PostDto tmp:post) {
			System.out.printf("번호:%d 	글제목:%s	 작성자:%s\n",tmp.getNum(),tmp.getPost_name(),tmp.getName());
		}
	}
}
