package exam_basic;

public class HwNo13 {

	// 1)1000 이하의 정수 중에서 2의 배수이면서 7의 배수인 숫자 출력
	// 2)그 숫자들의 합을 구해보세요 (while문)

	public static void main(String[] args) {
		// 1
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 2 == 0 && i % 7 == 0) {
//				System.out.println(i);
//			}
//		}

		// 2
		int i = 1;
		int sum = 0;

		while (i <= 1000) {
			if (i % 2 == 0 && i % 7 == 0) {
				sum += i;
				System.out.println(sum+ " " + i);
			}
			i++;
		}

	}
}
