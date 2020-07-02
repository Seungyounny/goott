package d20200702;

public class ForEx04 {
	public static void main(String[] args) {
		//1. 구구단 출력
		
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+ " * "+ j + " = "+ i*j );
			}
			System.out.println();
		}
		
		//2. 짝수단 출력
		
		for(int i=2;i<=9;i=i+2) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+ " * "+ j + " = "+ i*j );
			}
			System.out.println();
		}
		
		//3. 2단은 2단까지 4단은 4단까지 6단은 6단까지
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println(i+ " * "+ j + " = "+ i*j );
			}
			System.out.println();
		}
	}

}
