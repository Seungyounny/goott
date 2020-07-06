package d20200706;

/*
 * 실행 
 * 
 * 자바
 * 자바  A
 * 자바  A  1000
 * 자바  A  1000  10.5 
 * 자바  A  1000  10.5 true
 */

public class MethodEx04 {

	
	void printAll(String str, char ch , int x , double d , boolean bol) {
		System.out.println(str);
		System.out.println(str+ " "+ ch);
		System.out.println(str+ " "+ ch+ " "+ x );
		System.out.println(str+ " "+ ch+ " "+ x + " "+ d );
		System.out.println(str+ " "+ ch+ " "+ x + " "+ d + " " +  bol);
		
		
	}
	//  method overloading(메소드 오버로딩) 
	// : 하나의 이름이지만 다양한 상황에서 동작하게 하는 기능
	// : 메소드의 이름은 같게하고 매개변수 타입, 이름, 순서, 갯수를 다르게 하면 된다 
	// : 만드는 사람 (개발자)은 불편하지만 쓰는 사람은 편해짐
	
	
	void print(String str) {
		System.out.println(str);
	}
	void print(String str, char ch) {
		System.out.println(str+ " "+ ch);
	}
	void print(String str, char ch, int x ) {
		System.out.println(str+ " "+ ch+ " "+ x );
		
	}	void print(String str, char ch, int x, double d ) {
		System.out.println(str+ " "+ ch+ " "+ x + " "+ d );
	}
	void print(String str, char ch, int x, double d,boolean bol ) {
		System.out.println(str+ " "+ ch+ " "+ x + " "+ d+ bol );
	}

	
	public static void main(String[] args) {
		MethodEx04 me4=new MethodEx04();
		me4.printAll("java", 'A', 1000, 10.5 ,true );
		
		System.out.println("---------------");
		
		me4.print("자바",'A');
		
	}
}
