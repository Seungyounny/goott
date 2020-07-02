package d20200701;
//6. 논리 연산자 : &&, ||

public class OperEx06 {
	public static void main(String[] args) {
		
		boolean bl1 = true;
		boolean bl2 = false;
		
		// b1, b2를 and 연산
		System.out.println("b1 && b2 : " +(bl1 && bl2));
		
		// b1, b2를 or 연산
		System.out.println("b1 || b2 : " +(bl1 || bl2));
		
		
		System.out.println("b1 & b2 : " +(bl1 & bl2));
		// 비트 연산자가 논리 연산자 역할도 가능함. 그러나 반대로는 불가능.
		
		
		
	}

}
