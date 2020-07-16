package d20200708;

public class TestMain3 {
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic me1 = new Medic();
		
		m1.공격하기(m2);
		
		System.out.println("m2.hp : " +m2.hp);
		
		// 메딕으로 m2를 치료해보세요
		
		me1.치료하기(m2);
		
		System.out.println("m2.hp : " +m2.hp);
		
		System.out.println("-----------------------");
	}
	
	
	

}
