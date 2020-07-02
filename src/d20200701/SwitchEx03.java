package d20200701;

import java.util.Scanner;

//국어, 영어, 수학 점수를 차례대로 입력받기
//평균점수와 학점을 구하시오 - switch문 사용

public class SwitchEx03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // 스캐너 세번 만들필요없이 이렇게 가능.
		
		System.out.println("국어 성적을 입력하세요 : ");
		int k_score = sc.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int e_score = sc.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int m_score = sc.nextInt();
		
		System.out.println(""+k_score +", "+e_score +" , " +m_score);
//		System.out.println("국어성적 : " + score1);
//		
//		System.out.println("영어 성적을 입력하세요 : ");
//		Scanner sc2 = new Scanner(System.in);
//		
//		int score2 = sc2.nextInt();
//		System.out.println("영어성적 : " + score2);
//		
//		System.out.println("수학 성적을 입력하세요 : ");
//		Scanner sc3 = new Scanner(System.in);
//		
//		int score3 = sc3.nextInt();
//		System.out.println("수학성적 : " + score3);
		
		
		
		double avgscore = (k_score + e_score + m_score)/3;
		System.out.println("평균점수는 : " +avgscore);
		
		

		String grade = "";
		int key = (int)avgscore/10;
		
		
		switch(key) {
		case 10 :
		case 9 : grade = "A"; break;
		case 8 : grade = "B"; break;
		case 7 : grade = "C"; break;
		case 6 : grade = "D"; break;
		default : grade = "F"; break;
		} //switch end
		System.out.println("당신의 학점은 " + grade +"입니다.");
	}

}
