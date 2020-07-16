package d20200715;

public class OuterClassEx02 {
	private int a = 10;
	static int b = 20;
	static final int C = 30;
	
	static class StaticInnerClass{
		int d = 40;
		static final int E = 50;
		static int F = 60;
		
		public void print() {
			//System.out.println("a : " +a);
			System.out.println("b : " +b);
			System.out.println("C : " +C);
			System.out.println("b : " +d);
			System.out.println("E : " +E);
			System.out.println("F : " +F);
		} // print end
	} // SIC end
	public static void main(String[] args) {
		// print()는 static inner class의 메서드이므로 굳이 outer class 호출 필요 x
		StaticInnerClass sic = new StaticInnerClass();
		sic.print();
	}

}
