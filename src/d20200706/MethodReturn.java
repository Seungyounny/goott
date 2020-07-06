package d20200706;

public class MethodReturn {
	
	/*
	 * 실행화면
	 * 
	 * 1. 자바
	 * 2. A
	 * 3. 1000
	 * 4. 3.14
	 * 5. true
	 */

	
	void printStr(String str) {
		System.out.println(str);
		
	}
	String returnStr() {
		
		return "자바";
		//call by name 
		
	}
	char returnChar() {
		return 'A';
		
	}
	int returnInt() {
		return 1000; 
	}
	double returnDouble() {
		return 3.14;
		
	}
	boolean returnboolean() {
		return true;
	}
	public static void main(String[] args) {
		MethodReturn mr =new MethodReturn();
		
		mr.printStr("자바와 파이썬을 기반으로 하는 빅데이터 분석 웹 개발자");
		
		String str =mr.returnStr();
		System.out.println(str);
		System.out.println(mr.returnChar());
		System.out.println(mr.returnInt());
		System.out.println(mr.returnDouble());
		
		
	}

	
}
