package d20200715;

public class OuterClassEx03 {
	private int a = 10;
	static int b = 20;
	static final int C = 30;
	
	public void printAll() {
		
		// 지역변수처럼 class를 사용 : Local Inner Class
		class LocalInnerClass{
			int d = 40;
			static final int E = 50;
			//static int F = 60;
			
			public void print() {
				System.out.println("a : " +a);
				System.out.println("b : " +b);
				System.out.println("C : " +C);
				System.out.println("b : " +d);
				System.out.println("E : " +E);
				//System.out.println("F : " +F);
			} // print end		
		} // LIC end
		LocalInnerClass lic = new LocalInnerClass();
		lic.print();
	} // printall end
	
	public static void main(String[] args) {
		OuterClassEx03 oe3 = new OuterClassEx03();
		oe3.printAll();
	}

}
