package exam_basic2;

public class HwNo5 {
	
	/*
	 * 5. 구구단 옆으로 출력하기

2* 1 = 2   2 * 2 = 4    2 * 3 = 6        2 * 9  = 18
3 * 1 = 3   3 * 2 = 6   3 * 3 = 9 ...   3 * 9 = 27

	 */

	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print( i + " * "+ j +" = "+ i*j +"    ");
			}
		}
	}
}
