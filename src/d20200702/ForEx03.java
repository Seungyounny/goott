package d20200702;

public class ForEx03 {
	public static void main(String[] args) {
		/*
		 * for반복문
		 * for(초기식; 조건식; 증감식){
		 * 문장....
		 *
		 *}
		 */
		
		// 1부터 16까지 짝수만 출력
		
		for(int i=1;i<16;i++) {
			if(i%2==0) {
				System.out.println(i);
			} else {
				continue;
			}
		} // for문 끝
		System.out.println("------------------------");
		for(int k=1; k<=9; k++) {
			System.out.print(k+ " ");
			// ln에 개행(엔터)기능이 들어있음
		} // for문 끝
		System.out.println();
		System.out.println("-------------------------");
		
		
		int sum =0;
		// 1부터 10까지의 합 출력
		for(int i=1;i<=10;i++) {
			sum += i;
			System.out.println("1부터" +i +"까지의 합은  : " +sum);
		} System.out.println("1부터 10까지의 합은  : " +sum);
		
	} // main 끝

} // 클래스 끝
