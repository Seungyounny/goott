package d20200713;

// final
// - 멤버 변수 앞에 : 마지막 변수(상수)
// - 메소드 앞에 : 마지막 메소드(오버라이드 금지)
// - 클래스 앞에 : 마지막 클래스(상속 불가)

class Fruit {
	// 사과, 바나나, 복숭아를 상수로 정의
	final static int APPLE = 1;
	final static int BANANA = 2;
	final static int PEACH = 3;
}

class Company{
	//아마존, 구글, 애플 상수로 정의
	final static int AMAZON = 1;
	final static int GOOGLE = 2;
	final static int APPLE = 3;
}

public class FinalEx01 {
	public static void main(String[] args) {
		// 과일 분류하기 위한 switch문
		
//		Fruit f = new Fruit();
		
//		int type = f.APPLE;
		
		int type = Fruit.APPLE;  // 원래는 new하고 해야하지만 파이널은 클래스.변수로 가능
		//		System.out.println(type);
		
		// 누군가가 Company 상수를 호출하면?
		type = Company.AMAZON;
		
		switch(type) {
		case Fruit.APPLE : System.out.println("사과"); break;
		case Fruit.BANANA : System.out.println("바나나"); break;
		case Fruit.PEACH : System.out.println("복숭아"); break;
		}
	}
}
