package d20200707;

public class GuGuDan {

	// oop형태로 구구단 3단 출력
	// g.print();

	// 멤버변수 (필드) 1. 데이터를 담는 변수생성
	int dan;
 
	// 생성자              2. 초기화
	GuGuDan() {

		dan = 3;

	}

	// 멤버 메소드        
	void print() {
		// 구구단 로직
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

	}

	public static void main(String[] args) {
		GuGuDan g = new GuGuDan();
		g.print();
	}

}
