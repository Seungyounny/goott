package d20200707;

public class Computer {

	// 1.멤버변수 (필드)
	int keyboard;
	float monitor;
	double mouse;
	double 본체;

	// 2. 생성자 ( Constructor )
	
	Computer() { //값 초기화
		keyboard = 11;
		monitor = 17.3f;
		mouse = 3.2;
		본체 = 10.2;

	}

	// 3. 멤버 메소드

	void 연산하기() {
		System.out.println("연산을 열심히 합니다. ");
	}

	void 전원켜기() {
		System.out.println("안녕하세요");
	}

	void 전원끄기() {
		System.out.println("띵띵 띠리딩");
	}

	void 인터넷하기() {
		System.out.println("클릭클릭");
	}

	void 코딩하기() {
		System.out.println("ctrl c + ctrl v");
	}

	public static void main(String[] args) {
		Computer com = new Computer();
		com.인터넷하기();
		System.out.println(com.monitor);
	}

}
