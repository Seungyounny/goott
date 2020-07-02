package d20200701;

//연산자
//1. 증감연산자 : ++,--

public class OperEx01 { // 클래스 시작
	public static void main(String[] args) { // 메인 시작
		int a = 100; // int 자료형 변수 a를 선언, 100을 대입 초기화
		int b = 100; // int 자료 변수 b 선언, 100 대입 초기화
		
		//a = a + 1; // a를 출력했더니 a라는 변수에 1을 더해서 대입 , a++ 랑 같음.
		//a++;
		//b--;
		
		b = a++; // 후치연산 : a에 100을 대입하고 b에 먼저 대입한 후 a를 증가 
		// b = a -> a++; 
		
		b = ++a; // 전치 연산 : a에 100을 대입, a를 증가 시킨 뒤 b에 대입.
		
		System.out.println("a = "+a + ",b = " +b);
		
		
	} // 메인 끝

} // 클래스 끝
