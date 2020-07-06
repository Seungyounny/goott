package d20200706;

import java.util.*;

public class MethodParam {

	void paramDemo(int sum) {
		
		double ans =sum/3;
		
		String grade = "";

		if (ans >= 90 && ans <= 100) {
			grade = "A";

		} else if (ans >= 80 && ans < 90) {
			grade = "B";

		} else if (ans >= 70 && ans < 80) {
			grade = "C";

		} else if (ans >= 60 && ans < 70) {
			grade = "D";

		} else if (ans >= 50 && ans < 60) {
			grade = "D";

		} else {
			grade = "F";
		}

		System.out.println("평균 점수 : " + ans);
		System.out.println("학점 : "+ grade);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("체육 점수를 입력하세요 : ");
		int k_score = sc.nextInt(); // 선언 및 초기화

		System.out.println("음악 점수를 입력하세요 : ");
		int e_score = sc.nextInt();

		System.out.println("미술 점수를 입력하세요 : ");
		
		int m_score = sc.nextInt();

		// 평균점수, 학점 구하기 : call by value 형태로 메소드를 호출하여 결과 (평균점수와 학점 출력)
		// 메소드 명 : paramDemo()

		int ans = (k_score + e_score + m_score);

		MethodParam pr = new MethodParam();
		pr.paramDemo(ans);

	}

}
