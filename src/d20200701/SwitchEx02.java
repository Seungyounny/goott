package d20200701;

import java.util.Scanner;

// 실습 : 학점 구하는 switch문 작성
// 사용자(교수자)로 부터 성적을 입력 받은 후
// 출력 : 당신의 학점은 ~~ 입니다.

public class SwitchEx02 {
	public static void main(String[] args) {
		
		// 1. 사용자의 입력을 받는다
		System.out.println("학생의 성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		System.out.println("score : " + score);
		
		char g = ' ';
		// 2. key값 정리
		//    case에는 값 하나만 인정됨
		int key = score/10; // 이러면 80~89 이렇게 까지 커버가능 int때문에 소수점없애줌
		
		
		// 3. switch문 구성
		
		
		switch(key) {
		case 10 :
		case 9 :  g = 'A'; break;
		case 8 :  g = 'B'; break;
		case 7 :  g = 'C'; break;
		case 6 :  g = 'D'; break;
		default : g = 'F'; break;
			
		} System.out.println("당신의 학점은 " +g + "입니다.");
		//4. 최종출력
		
	}

}
