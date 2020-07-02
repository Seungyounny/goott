package d20200702;

import java.util.Scanner;

public class ForEx01 {
	public static void main(String[] args) {
		// 사용자로부터 숫자 하나를 입력받아서 해당 구구단을 출력
		System.out.println("숫자 하나를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("입력한 숫자는 : " + num + "입니다.");
		
		for(int j = 1; j<10; j++) {
			System.out.println(num + " * " +j +" = " +(num*j));
		}
	}

}
