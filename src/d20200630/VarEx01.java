package d20200630;
// 식별자
// 1. primitive type
// 정수형 : byte, short, int, long


public class VarEx01 {
	public static void main(String[] args) { // 메인이 필요행!
		// 변수 : 데이터를 저장하거나 참조하기 위해 메모리에 공간을 할당하는 것 (그릇)
		
		// 변수 사용법 : 식별자(자료형) 변수명; ==> 변수를 선언한다
		byte b1; // -128 ~ 127
		
		// 초기화
		b1 = 10;  // = : 대입 연산자 (같다가 아님) , 오른쪽에 있는 애를 왼쪽에 집어넣음.
		
		b1 = 20;
		
		short sh1;
		sh1 = 10000;
		
		int it; 
		it = 99999999;
		
		long lo;
		lo = 2034790231;  
		
		
		
		System.out.println("b1 : " + b1); // 변수 b1 값 출력
		System.out.println("sh1 : " + sh1);
		System.out.println("it : " + it);
		System.out.println("lo : " + lo);
		
		
	} // 메인끝

}// 클래스 끝
