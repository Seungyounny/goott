package d20200717;

import java.util.Scanner;

public class TryCatchEx01 {
public static void main(String[] args) {
		

			System.out.println("두 개의 정수릅 입력 : ");
			Scanner sc = new Scanner(System.in);
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			try {
				System.out.println("몫 : " + (num1/num2));
				System.out.println("나머지 : " + (num1%num2));
				
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("오류가 생기면 대체할 화면을 구현할 객체");
				System.out.println("숫자를 다시 입력하세요----");
				System.out.println(e.getMessage());
				System.out.println(e.getStackTrace());
			}
//			
//			System.out.println("몫 : " + (num1/num2));
//			System.out.println("나머지 : " + (num1%num2));
			
			
		
	}
}


