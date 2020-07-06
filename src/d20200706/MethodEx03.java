package d20200706;

public class MethodEx03 {

	
	/*
	 * 메소드 실행
	 * 1. A
	 * 2. 1000
	 * 3. 10.5
	 * 4. false
	 * 
	 */
	
	void printChar(char ch) {
		System.out.println("1. " + ch);
	}
	
	void printInt(int x) {
		System.out.println("2. "+ x);
	}
	void printDouble(double d) {
		System.out.println("3. "+ d);
	}
	void printBoolean (boolean b) {
		System.out.println("4. "+ b);
	}
	
	
	void PrintAll(char ch, int x, double d , boolean b) {
		System.out.println("1. "+ ch);
		System.out.println("2. "+ x);
		System.out.println("3. "+ d);
		System.out.println("4. "+ b);
		
	}
	
	public static void main(String[] args) {
		MethodEx03 me3 =new MethodEx03();
		
//		me3.printChar('A');
//		me3.printInt(1000);
//		me3.printDouble(10.5);
//		me3.printBoolean(false);

		System.out.println("-------------------------");
		//printall() 로 출력
		
		me3.PrintAll('A', 1000, 10.5, false);
	
		
	}
	
	
}
