package d20200717;

// extends - 확장

// 1. 사람 관련 정보인데 갑자기 동물 관련 클래스가 생성이 된다면?
//  : 방지할 필요가 있으므로 generic을 통해 방지할 장치를 마련


// 3. 사람 관련 특성을 생성

interface Personalbe{};
interface Ranking{};

// 5. 원하는 클래스에 추가
class Stu implements Personalbe{};
class Emp implements Personalbe, Ranking{};

class Ani{};

// 4. generic 객체에 상속(확장)

class Per<T extends Personalbe>{
	T info;
	
	public Per(T info) {
		this.info = info;
	}
}

public class GenericExtends {
	public static void main(String[] args) {
		Per<Stu> ps = new Per<Stu>(new Stu());
		System.out.println(ps);
		
		Per<Emp> pe = new Per<Emp>(new Emp());
		System.out.println(pe);
		
//		Per<Emp> pe2 = new Per<Emp>(new Stu());
//		System.out.println(pe2);
		
//		Per<Ani> pa = new Per<Ani>(new Ani());
//		System.out.println(pa);
		
		// Per의 대상으로 Stu, Emp (사람 관련 객체만 사용하고 싶음)
		
		
	}

}
