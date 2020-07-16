package d20200713;

interface Fruit2{
	// 인터페이스 추상메소드, 상수
	final static int APPLE = 1;
	final static int BANANA = 2;
	final static int PEACH = 3;
	
}

interface Company2{
	final static int AMAZON = 1;
	final static int GOOGLE = 2;
	final static int APPLE = 3;
}

public class FinalEx02 {
	public static void main(String[] args) {
		// 과일 분류하기 위한 switch문
		
		int type = Fruit.APPLE;
		type = Company.AMAZON;
		
		switch(type) {
		case Fruit.APPLE : System.out.println("사과"); break;
		case Fruit.BANANA : System.out.println("바나나"); break;
		case Fruit.PEACH : System.out.println("복숭아"); break;
		}
	}

}
