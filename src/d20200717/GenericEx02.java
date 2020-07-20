package d20200717;

/*
 * 
 *       int a;				// a의 자료형은 항상 int --> 유동성 있게 사용할 수 없나?
 *       
 *       Object a;
 *       
 *       int b = (int) a
 *       
 *       String s = (String) a;
 *       
 *       => 항상 Object로 변수를 선언하는 것은 부담
 *       => generic
 * 
 * 
 * 
 */

public class GenericEx02 {
	public static void main(String[] args) {
		Animal<String> animal1 = new Animal("참새");
		Animal<Object> animal2 = new Animal("시조새");
		Animal<Integer> animal3 = new Animal(2020);
		
//		System.out.println(animal1.str_name);
//		System.out.println(animal2.obj_name);
//		System.out.println(animal3.str_name);
//		System.out.println(animal3.obj_name);
		
		System.out.println(animal1.name);
		System.out.println(animal2.name);
		System.out.println(animal3.name);
	}

}

class Animal<T>{
	T name;
//	String str_name;
//	Object obj_name;
//	
	public Animal(T name) {
		this.name = name;
	}
	
//	public Animal(String str_name) {
//		this.str_name = str_name;
//	}
//	// 주의 : generic과 Object는 type이 같다고 인식됨 -> 충돌이 남
//	public Animal(Object obj_name) {
//		this.obj_name = obj_name;
//	}
	

	
}