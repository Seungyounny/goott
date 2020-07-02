package d20200701;

//3. shift 연산자 : >>,<<,>>>
// 기초적인 암호화 혹은 인코딩 시에 쓰임
public class OperEx03 {
	public static void main(String[] args) {
		byte b = 10; // 메모리에 00001010 으로 있음.
		
		// >> : 맨 앞의 비트값이 0이면 0으로, 1이면 1으로 들어옴
		System.out.println("b >> 2 : " + (b >> 2));
		// 0000 1010 >> 0000 0010
		
		
		System.out.println("b << 2 : " + (b << 2));
		// 0000 1010 << 0010 1000
		
		// >>> : 맨 앞의 비트값과 관계없이 0이 들어옴
		System.out.println("b >>> 2 : " + (b >>> 2));
		
	}

}
