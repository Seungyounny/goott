package d20200708;

public class TestMain2 {
	public static void main(String[] args) {
		메딕 me = new 메딕();
		me.이동하기(400, 300);
		me.status();
		
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		
		// 마린 m3를 생성 - 현질(?) ==> super marine이 필요함(hp만 500)
		// SuperMarine sm = new SuperMarine();
		// s.o.p(sm.hp);
		마린 su = new 마린(500);
		su.status();
		
		System.out.println("------------------------");
		마린 m3 = m1; // 참조값 그대로 복사
		m3.hp = 50;
		
		System.out.println("m1 : " +m1);
		System.out.println("m3 : " +m3);
		
		System.out.println("-------------------------");
		// 마린 객체 공격하기가 필요
		m1.공격하기(m2);
		m2.status();
		
		// 메딕 객체가 치료하기 기능이 필요
		// m2를 치료
		me.치료하기(m2);
		m2.status();
		me.치료하기(m2);
		me.치료하기(m2);
		m2.status();
		
	}

}
