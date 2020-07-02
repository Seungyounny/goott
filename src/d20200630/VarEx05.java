package d20200630;

public class VarEx05 {
	public static void main(String[] args) {
		
		char ch5 = 'A'; // 문자형
		char ch6 = 65; //ASCII 그대로
		char ch7 = '\u0064'; // unicode
		char ch8 = 99;
		// 각각 출력해서 확인
		// ctr1 + alt + 아래방향키 : 선택된 행 복사
		System.out.println("ch5 : " +ch5);
		System.out.println("ch6 : " +ch6);
		System.out.println("ch7 : " +ch7);
		System.out.println("ch8 : " +ch8);
		
		System.out.println("------------------");
		
		// 특별한 의미를 갖게 해주는 기호 : \ -> escape 문자라고 함.
		System.out.println("오늘은 \t화요일입니다. \n내일은 수요일입니다.");
		// \n : 개행(엔터기능), \t : tab만큼 띄어쓰기, \b : backspace 기능
		// \\ : \ 표현 , 
		
	}

}
