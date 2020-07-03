package exam_basic2;

public class HwNo8 {

	/*
	 * 8~9 . 아래의 데이터를 정렬시키는 코드를 작성하시오. (두 가지 이상의 정렬 알고리즘을 사용 하세요 ) // 위키피디아 검색해서
	 * 공부해오시면 됩니다. ^^ - 선택 정렬 - 나머지 하나
	 * 
	 * int[] data = { 100,20,5,2,3,34,65,23,66,200};
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[] data = { 100, 20, 5, 2, 3, 34, 65, 23, 66, 200 };

		select(data);

		
		int[] data2 = { 100, 20, 5, 2, 3, 34, 65, 23, 66, 200 };
		
		bubble(data2);

	}

	private static void bubble(int[] data2) {

		for (int i = 0; i < data2.length; i++) {// index랑 관련 없고 sort하는 횟수 지정
			for (int j = 0; j < data2.length - 1; j++) {
				// 버블정렬은 내 바로 오른쪽 값과 비교해서 내가 더 크면 두개 자리를 바꿔줌
				if (data2[j] > data2[j + 1]) {
					int temp = data2[j];
					data2[j] = data2[j + 1];
					data2[j + 1] = temp;
				}
			}
		}
		
		for (int i = 0; i < data2.length; i++) {
			System.out.print(data2[i] + "  ");

		}
		

	}

	private static void select(int[] data) {

		int min; // 최소값 인덱스
		int temp;

		for (int i = 0; i < data.length - 1; i++) {// 맨 마지막은 안해도됨
			min = i; // 처음시작은 i번째 값

			for (int j = i + 1; j < data.length; j++) { // j는 i 다음부터
				if (data[min] > data[j]) {// min 보다 새로운 data[j]가 작으면 min =j
					min = j;
				}
			}

			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
			// 젤 작은 값과 data 바꿈
		}

		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "  ");

		}

	}

}
