package exam_basic2;

import java.util.*;

public class HwNo11 {

	/*
	 * 1) 컴퓨터가 3자리 정수 - 랜덤하게 생성 2) 각각 자리수가 서로 일치하지 않는지 검사 3) 사용자로부터 입력값 받기 - 3자리
	 * 정수//scanner 4) 사용자가 입력한 값과 컴퓨터가 생성한 값을 비교 5) 판정결과를 출력 : ~~ strike, ~~ ball
	 * //자릿수와 숫자가 모두 같으면 strike. 숫자가 같고 위치가 다르면 ball 6) 3S가 되면 경기를 종료, 그렇지 않으면 반복
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int com[] = new int[3];

		boolean flag = true;

		while (flag) {
			com[0] = (int) (Math.random() * 10);
			com[1] = (int) (Math.random() * 10);
			com[2] = (int) (Math.random() * 10);

			if (com[0] != 0 && com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) {

				flag = false;// 탈출조건. 0이 아니고 세개가 다 다를 떄

			} // if 끝
		} // while 끝

		System.out.println(com[0] + " " + com[1] + " " + com[2]);

		boolean flag2 = true;

		while (flag2) {

			Scanner sc = new Scanner(System.in);
			System.out.println("3 자리 정수를 입력하세요 ");
			int value = sc.nextInt();

			int userinput[] = new int[3];
			userinput[0] = value / 100;
			userinput[1] = (value % 100) / 10;
			userinput[2] = value % 10;

			int strike = 0;
			int ball = 0;

			for (int i = 0; i < 3; i++) {
				if (com[i] == userinput[i]) {
					strike++;
				} else {
					for (int j = 0; j < 3; j++) {
						if (com[j] == userinput[i]) {
							ball++;

						}
					}

				}
			} // 외부 for 문

			System.out.println(strike + " strike , " + ball + " ball ");
			
			if (strike == 3) {
				flag2 = false;
				break;
			}
		}

	}// main
}
