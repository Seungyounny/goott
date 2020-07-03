package exam_basic2;

public class HwNo7 {

	/*
	 * 
	 * 7.score 배열에 국어 , 영어 , 수학 점수가 들어있다. 총점과 평균을 계산해서 배열에 담은 후 모든 학생의 국어, 영어, 수학,
	 * 총점, 평균을 출력하시오 참고) 배열에는 국어, 영어 수학 점수만 들어있다.
	 * 
	 * int[][] score = { {80,80,80,0,0}, {60,50,80,0,0}, {50,90,90,0,0},
	 * {40,50,60,0,0}, {90,90,95,0,0}, {85,95,100,0,0}, };
	 * 
	 */
	public static void main(String[] args) {

		int[][] score = { { 80, 80, 80, 0, 0 }, { 60, 50, 80, 0, 0 }, { 50, 90, 90, 0, 0 }, { 40, 50, 60, 0, 0 },
				{ 90, 90, 95, 0, 0 }, { 85, 95, 100, 0, 0 }, };

		for (int i = 0; i < score.length; i++) {
			int sum = 0;

//			for (int j = 0; j < 3; j++) {
//				sum += score[i][j];//세 과목 합 
//			}
			sum = score[i][0] + score[i][1] + score[i][2];

			score[i][3] = sum;
			score[i][4] = sum / 3;

		}

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[1].length; j++) {
				System.out.print(score[i][j] + "  ");
			}System.out.println();
		}
	}

}
