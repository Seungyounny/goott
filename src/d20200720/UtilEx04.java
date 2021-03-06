package d20200720;

import java.util.StringTokenizer;

/*
 * 문자열을 조건에 따라 나눌 수 있게 해주는 클래스
 * ex) "11:02" 이런 시각 정보가 있을 때
 * 	      시와 분을 나눠서 처리하고 싶으면 ":"를 찾을 수 있어야 함 -> 구분자
 * 		나눠지는 문자열 정보 : 토큰
 * 
 * 
 * 
 * 
 */

public class UtilEx04 {
	public static void main(String[] args) {
		String str = "11:22:33:44:55:66";
		
//		char[] ch = str.toCharArray();
//		for(char c : ch) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		StringTokenizer stk = new StringTokenizer(str,":");
//		System.out.println(stk.countTokens());
		
		while(stk.hasMoreTokens()) {
			System.out.print(stk.nextToken() + "  ");
			
		}System.out.println();
		
		System.out.println("--------------------------------------");
		
		String phoneNumber = "Tel 010-9970-9373";
		System.out.println(phoneNumber);
		
		StringTokenizer stk1 = new StringTokenizer(phoneNumber);
		
		// 구분자를 지정하지 않으면 default는 공백을 구분자로 사용
		
		while(stk1.hasMoreTokens()) {
			System.out.println(stk1.nextToken() + " ");
		}
		
		System.out.println("----------------------------");
		// 구분자 둘 이상도 가능
		
		StringTokenizer stk2 = new StringTokenizer(phoneNumber, " -");
		while(stk2.hasMoreTokens()) {
			System.out.println(stk2.nextToken() + " ");
		}
		
		System.out.println("----------------------------------");
		String code = "num += 1";
		
		// 구분자를 토큰으로 간주할지 말지 결정
		StringTokenizer stk3 = new StringTokenizer(code, "+=", false);
		while(stk3.hasMoreTokens()) {
			System.out.println(stk3.nextToken() + " ");
		}
		
		
	}

}
