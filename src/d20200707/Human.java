package d20200707;

public class Human {

	// 사람이 가진 특성은 멤버변수로

	int 눈;
	int 코;
	int 입;
	int iq;

	String 성별;
	int 나이;

	double 키;
	double 몸무게;

	String 이름;

	// 생성자로 초기화
	// 기본 생성자 : 매개변수가 없는 생성자. 다른 개발자가 정보를 바꿀수없다.

	Human() {
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;
		성별 = "남자";
		나이 = 20;
		키 = 175.5;
		몸무게 = 69.5;
		이름 = "홍길동";
		System.out.println("생성자 호출");

	}

	// 내 클래스를 사용할 사람들 (개발자)를 위해서 다양한 생성자를 갖는 클래스로 작성하는 것을 권장

	// 이름하고 성별을 수정할 수 있도록 허락하는 것.

	// 이름, 성별을 수정 할 수 있도록 허락. 생성자 오버로딩 !

	Human(String 이름, String 성별) {
		눈 = 2;
		코 = 1;
		입 = 1;
		iq = 100;

		나이 = 20;
		키 = 175.5;
		몸무게 = 69.5;
		this.성별 = 성별; // 입력받은 성별
		this.이름 = 이름; // 입력받은 이름
		// this.성별 로 한 것은 자기자신(전역변수) 객체를 가르키는 것이다 !!!!!!
		// this가 아닌것은 매개변수!! 들어온 값을 내 전역변수에 넣으셈 이런거!
	}
	// 이름, 성별, 키를 다른 사용자가 초기화하여 사용할 수 있도록 허락하는 생성자

	Human(String 이름, String 성별, double 키) {
//		눈 = 2;
//		코 = 1;
//		입 = 1;
//		iq = 100;
//		나이 = 20;
//		몸무게 = 69.5;

		// 기본 생성자를 실행하고 내가 원하는 것만 수정하고 싶다
		// --> 생성자 인자가 너무 많아서 수정이 불편하고 코드 중복이 많으므로

		this(); // 위에 하나하나 다 생성하기 귀찮아...그니까 this를 선언해서 Human()을 생성한 후에 필요한부분만 바꿔준다.

		this.키 = 키;// 입력받은 키
		this.성별 = 성별; // 입력받은 성별
		this.이름 = 이름; // 입력받은 이름

	}
	
	//이름, 성별,키, 몸무게, 나이를 다른 사용자가 초기화하여 사용 할 수 있도록 
	Human(String 이름, String 성별, double 키, double 몸무게, int 나이) {
		//생성자 : 객체 초기화 => 멤버 변수를 초기화
		// 멤버변수명 = 매개변수명;
		// this.맴버변수 = 매개변수명 (권장)
		
		this(이름,성별,키); //기본생성자 + 이전 생성자까지 한번에 실행
		
		this.몸무게 =몸무게;
		this.나이=나이;
		
		
		
		
	}

	// 사람이 하는 행동은 멤버 메소드로
	void 먹기() {
		System.out.println("삼시세끼를 먹어요");
	}

	void 자기() {
		System.out.println("하루 8시간은 자야해요 ");
	}

	void 걷기() {
		System.out.println("하나 둘 하나 둘");
	}

	void 생각하기() {
		System.out.println("멍~~~~");
	}

	void 코딩하기() {
		System.out.println("와 재 밌 당 ");
	}

	// 선언 해 놓은 것들을 실체화 하려면 메모리에 올려야함

}
