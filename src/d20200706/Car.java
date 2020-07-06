package d20200706;

//> 클래스 
//: 하나의 클래스는 메모리 할당시 다양한 값을 가지게 되면 개게라고 불림
//하나의 객체는 독립적으로 사용


public class Car {

	
	//특성 ( 성질 ) 얘네를 멤버 변수라고 한다. 
	String manf = "롤스로이스";
	String engine = "16기동";
	String name = "팬텀";
	String wheel = "20인치";
	
	//행동  (행위)
	void go() {
		//전진이라는 행위를 할 애. 어떤 행동을 할지는 괄호 안에서 실행 ( 로직을 작성 )
		System.out.println("와 되게 빠름...");
	}
	void back() {
		System.out.println("와 후방카메라...");
	}
	void stop() {
		System.out.println("와 잘멈춤....");
	}
	
	
	public static void main(String[] args) {
		Car car; //객체를 선언 ( 메모리엔 안올렸음 )
		car = new Car(); // 인스턴스화... 생성자를 선언해야함. 근데 나는 안만들었지만 JVM 에서 자동으루 만드러줌 
		
		
		System.out.println("car" + car); //요기 주소에 저장되어있어 ! 힙 영역 !!

		String carManf = car.manf;
		System.out.println(carManf);
		//데이터는 새로운 변수를 선언해서 이렇게 담아서 쓰면 되고 , 
	
		car.go();
		//행위 ( 메소드) 는 그냥 이렇게 써주면 된다 
		
		
	} //main 끝
	
}//Car class 끝 
