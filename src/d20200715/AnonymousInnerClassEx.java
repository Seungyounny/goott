package d20200715;

import d20200708.마린;
import d20200713.Flyable;

/*
 * - 통상적인 클래스 구현 방식
 *  : 클래스명 참조변수 = new 생성자();
 * 
 * 
 * - 익명 클래스 구현
 *  : new 인터페이스() {변수(상수),메소스 선언}
 *  
 *  ex)
 *  Flyable f0 = new Flyable();   (x)
 *  : 인터페이스는 추상메소드와 상수만 존재 - 추상 객체
 *  : 구현부가 없으므로 new를 통해 인스터스화 할 수가 없어
 *  
 *  
 *  
 *  마린 m = new 마린();
 *  
 *  Flyable f1 = (Flyable)m;
 *  
 *  Flyable f1 => Flyable 인터페이스를 구현한 객체의 참조값
 *  
 *  Flyable f2 = (Flyable)new 마린();
 *  
 * 
 */

public class AnonymousInnerClassEx {
	Flyable f = new Flyable() {
		
		@Override
		public void 비행() {
			// TODO Auto-generated method stub
			System.out.println("익명 클래스는 통한 method overriding");
		}
	}; 
	
	public static void main(String[] args) {
		AnonymousInnerClassEx aic = new AnonymousInnerClassEx();
		aic.f.비행();
		

	}

}
