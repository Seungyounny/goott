package exam_basic;

public class HwNo14 {

	/*
	 * 3.6.9 게임에서 박수가 필요한 숫자에서 "짝"을 출력하세요
(단 100까지만)

	 */
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			String s=Integer.toString(i);
			if(s.contains("3")) {
				s=s.replace("3", "짝");
			}
			System.out.println(s);
		}
	}
}
