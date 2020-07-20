package d20200717;

import java.util.Scanner;

// Exception : 가벼운 오류  				cf) error: 심한 오류
// 예외처리방법
// 1. try - catch
// 2. throws (예외전가)

public class ExceptionBasic {
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("두 개의 정수릅 입력 : ");
			Scanner sc = new Scanner(System.in);
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			// if문 사용해서 해결해보세요 (개발단에서 오류 해결)
			if(num2!=0) {
				System.out.println("몫 : " + (num1/num2));
				System.out.println("나머지 : " + (num1%num2));
			
			}else {
				System.out.println("숫자를 다시 입력하세요----");
			
			}
		}
		
	}

}
