package d20200714;


/*
 * 자바에서 생략이 가능한 것들
 * 1. import java.lang.* -> 
 * 2. 생성자
 * 3. extends Object
 * 4. this    <--- 뚜렷하게 구분이 되면 생략 가능 ===> 사용하는게 권장사항
 * 5. super()
 */



// Object : 자바 최고(root) 클래스

public class ObjectEx {
	// 어디에서든(누구나) - new 하지 않아도 - 리턴값이 필요 없는
	// main이라는 이름을 가진 method - 매개변수 이름을 args - String[] 배열
	public static void main(String[] args) {
		System.out.println("------Object------");
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println("obj1 : " +obj1);
		System.out.println("obj2 : " +obj2);
		
		if(obj1 == obj2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("------------------");
		if(obj1.equals(obj2)){
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		System.out.println("-----------------");
		
		System.out.println("ob1j1.toString() : " + obj1.toString());
		// toString() : 오브젝트의 값을 문자열로 표시해놓은 method
		
	}

}









