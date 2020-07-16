package d20200708;
/*
 * 
 * 고양이와 강아지의 공통 속성을 추출해서 동물이라는 클래스를 생성
 * - 이 공통된 속성들을 고양이와 강아지에게 상속하기로 함
 * 
 * (출력)
 * - (고양이 이름)는 물고기를 먹는다. 살금살금 걷는다. 호흡한다.
 * - (강아지 이름)는 사료를 먹는다. 터벅터벅 걷는다. 호흡한다.
 * 
 * 
 * 변수 : name, food
 * 메소드 : eat(), breath(), walking()
 * 
 * 데이터 전달 : 생성자
 */

public class ExtendsMain3 {
	public static void main(String[] args) {
		Cat cat = new Cat("야옹이", "물고기");
		cat.eat();
		cat.walking("쌀금살금");
		cat.breathe();
		
		System.out.println("----------------");
		
		Dog dog = new Dog("댕댕이", "사료");
		dog.eat();
		dog.walking("터벅터벅");
		dog.breathe();
		
	}

}
