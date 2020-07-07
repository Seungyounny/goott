package d20200707;

public class Data {

	/*
	 * 캡슐화 : 객체를 하나의 캡슐처럼 안전하게 하는 기법 (정보 은닉) - 멤버변수는 private, 메소드는 public 으로 처리
	 * (기본형) 일반적으로 이렇게 쓴다 ! (캡슐화를 구현하는 핵심적인 방법이 접근한정자. private,,,,) + 메소드에 권한이 필요한
	 * 검사, 검사기록을 생성해서 더 넣어두면 ==> 캡슐화 완 성 !
	 * 
	 * 
	 */

	private String name = "유관순";
	private int annual = 0;

	// setter : 멤버변수에 값을 지정하는 메소드

	public void setName(String name) {
		this.name = name;

	}

	// getter : 멤버 변수 값을 가져오는 메소드
	public String getName() {
		return this.name + " * ";

	}
	
	public void setAnnual(int annual) {
		this.annual=(int)(1.05*annual);
		
	}
	public int getAnnual() {
		return this.annual;
		
	}

}
