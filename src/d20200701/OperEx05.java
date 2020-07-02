package d20200701;
//5.비트 연산자 : & , |
public class OperEx05 {
	public static void main(String[] args) {
		byte a = 10; // 0000 1010
		byte b = 22; // 0001 0110
		
		// a & b : 각 자리수끼리 and연산 => 0000 0010
		System.out.println("a & b : " +(a&b));
		
		// a | b : 각 자리수끼리 or 연산 => 0001 1100
		System.out.println("a | b : " +(a|b));
	}

}
