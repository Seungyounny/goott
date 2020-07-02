package d20200701;

import java.util.Scanner;

/*
if(조건 a){
 문장 1;
 문장 2;
 .
 .
  } else if(조건 b){
  		문장3;
  		문장4;
  		.
  		.
  	} else if(조건c){
  	문장5;
  	문장6;
  	.
  	.
  	} else {
  	문장7;
  	문장8;
  	.
  	.
 }
 */

public class IfEx02 {
	public static void main(String[] args) {
		
		System.out.println("학생의 성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		System.out.println("score : " + score); // 데이터 잘 들어왔는지 확인 !!! 습관들이자
		
		//(조건) 분기문
		if(score >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		}else if(score >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		}else if(score >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(score >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		}else {
			System.out.println("당신의 학점은 F입니다.");
		}
		
	}

}
