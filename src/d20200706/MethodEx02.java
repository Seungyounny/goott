package d20200706;

import java.util.*;

//1. 임의의 두 정수 입력받기 -세번정도
//2. 두 수의 절댓값 계산해서 출력
//3. 메소드명 abs();


public class MethodEx02 {
	
	void abs(int x, int y ) {
		
		if(x>y) {
			System.out.println(x-y);
		}
		else {
			//x<y 임.
			System.out.println(y-x);
		}
		System.out.println("두 수의 절댓값은 : " + Math.abs(x-y));
		System.out.println();
	}

	
	public static void main(String[] args) {
		
		MethodEx02 ex2 =new MethodEx02();
		
		
		Scanner sc =new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.print (" 두 수를 입력하세요");
			System.out.print(" a: ");
			int a= sc.nextInt();
			
			System.out.print(" b: ");

			int b =sc.nextInt();
			
			ex2.abs(a, b);
		}
		
		
	}
}
