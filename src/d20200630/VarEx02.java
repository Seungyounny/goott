package d20200630; // 패키지 시작

public class VarEx02 { // 자바는 최소 단위가 클래스
	public static void main(String[] args) {
		
		byte b2 = 127; // 변수 선언과 동시에 초기화
		
		System.out.println("b2 : " +b2);
		
		System.out.println("---------------");
		
		byte b1 = 10;
		byte b3 = 20;
		
		//b2 = (b1+b3);
		// 자바는 내부적으로 int 이하의 연산에서는 모두 int로 자동변환하여 계산
		int c = (b1 + b3);
		
		System.out.println("c : " +c); //sysout ctr + space -> 자동
		System.out.println("--------------------");
		
		c = b1;
		
		b1 = (byte)c; // (강제)형변환
		
		System.out.println("c : " +c);
		
		System.out.println("---------------");
		
		int num = (int) 3.56;
		System.out.println("num : " + num);
		
		System.out.println("-----------");
		
		int NUMBER = 200;   // 상수
		System.out.println("NUMBER : " +NUMBER);
		// number = 300; 이렇게 가면 변수가 된다. 따라서 상수는 대문자로 하는편
		
		
	}

}
