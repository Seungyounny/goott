package d20200708;

public class Animal {
	// 멤버변수
	String name;
	String food;
	
	// 생성자	
	public Animal(String name, String food) {
		this.name = name;
		this.food = food;
	}
	
	// 멤버 메소드
	public void eat() {
		System.out.println(this.name + " 이/가" + this.food + "를 먹는다");
	}
	
	public void walking(String str) {
		System.out.println(str +" 걷는다.");
	}
	
	public void breathe() {
		System.out.println("호흡한다.");
	}

}
