package d20200630;
// 3) 문자형 : char
// char는 ' ' 안에 한글자 가능!
public class VarEx04 {
	public static void main(String[] args) {
		// 콘솔에 JAVA 글자를 출력
		char ch1 = 'J';
		char ch2 = 'A';
		char ch3 = 'V';
		char ch4 = 'A';
		
		System.out.println(""+ch1+ch2+ch3+ch4);
		// 출력식에 ""가 없으면 ASCII 코드값이 그대로 출력됨
		
		String str = "JAVA";
		System.out.println("str : " +str);
		
		System.out.println("-------------------");
		
		// 자바는 unicode도 지원 -> 변수를 한글 사용 가능 (단, 잘 쓰진 않음)
		String 한글 = "한글잘되나?";
		System.out.println(한글);
		
	}

}
