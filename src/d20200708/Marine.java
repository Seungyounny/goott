package d20200708;

public class Marine extends Teran {
	
	int 공격력;
	
	
	public Marine() {
		//super(); // 부모 클래스 생성자 실행(사용) ==> 생략가능
		this.공격력 = 5;
	}
	
	void 공격하기(Teran x) {
		// 매개변수를 Teran(부모클래스)으로 선언(지정)하면
		// 상속받은 애들 다 공격가능
		x.hp -= 공격력;
		
		System.out.println("탕~");
	}

}
