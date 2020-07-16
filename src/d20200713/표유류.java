package d20200713;

// 추상 클래스
// : abstract 클래스명

public abstract class 표유류 {
	int 눈;
	int 코;
	int 입;
	String 성별;
	
	// 추상클래스는 메소드가 행위를 가져서는 안됨.
	// 추상클래스는 미구현 메소드 (메소드 바디{} 가 없는 메소드) => 추상메소드로 만들어야 함
	
	// 추상메소드를 1개 이상 갖는 클래스는 반드시 추상 클래스이어야 함.
	// 추상메소드는 구현클래스에서 반드시 오버라이드 해서 사용.
	
	public abstract void 먹기();
	
	public abstract void 자기();
	
	public abstract void 태생();
	
	
	

}
