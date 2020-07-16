package d20200714;

public class StringEx02 {
	public static void main(String[] args) {
		String s = new String("Java Oracle");
		
		char ch = s.charAt(2);
		System.out.println(ch);
		
		// r 나오도록 출력, 공백문자도 포함.
		char ch1 = s.charAt(6);
		System.out.println(ch1);
		
		System.out.println("------------------------");
		String str1 = "화요일";
		
		// 문자열 연결
		System.out.println(s+str1);
		System.out.println(s.concat(str1));
		
		// 오늘은 화요일 내일은 수요일 - 출력
		
		String s1 = "오늘은 ";
		String s2 = "내일은 ";
		String s3 = "화요일 ";
		String s4 = "수요일 ";
		System.out.println(s1+s3+s2+s4);
		System.out.println();
		// 메소드 체이닝(chaining) 방식
		System.out.print(s1.concat(s3).concat(s2).concat(s4));
		System.out.println();
		
		System.out.println("--------------------------");
		// 내용 비교
		boolean result = s.contains("Java"); // 포함여부
		System.out.println("result : " + result);
		
		// equals : 글자 대소문자를 구분함에 유의!
		System.out.println(s.equals("JAVA ORACLE"));
		
		// 대,소문자를 무시
		System.out.println(s.equalsIgnoreCase("JAVA ORACLE"));
		
		// 위치 반환 메소드
		int position = s.indexOf('r');
		System.out.println("r은 " +position +"번째 위치에 있다.");
		
		// 문자열 길이를 반환해주는 메소드
		System.out.println(s.length());
		
		//  2번째 부터 6번째 글자를 출력
		System.out.println(s.substring(1, 6));
		
		// 문자열을 char[] 리턴하는 메소드
		char[]	ch2 = s.toCharArray();
		for(int i=0;i<ch2.length;i++) {
			System.out.print(ch2[i]);
		}
		System.out.println();
		System.out.println("------------------------------");
		// 향상된 for문, 개선된 for문
		for(char c : ch2) {
			System.out.println(c);
		}
		System.out.println("--------------------------");
		// String도 배열 가능
		String[] data = {"사과","배","포도","딸기"};
		// for(자로형 변수 : 원데이터)
		for(String str : data) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		
		
	}

}
