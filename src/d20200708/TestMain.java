package d20200708;

public class TestMain {
	public static void main(String[] args) {
		마린 m1 = new 마린();
		m1.status();
		m1.이동하기(500, 200);
		m1.status();
		
		System.out.println("------------------------");
		마린 m2 = new 마린();
		m2.이동하기(400, 250);
		m2.status();
	}

}
