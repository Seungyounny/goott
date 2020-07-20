package d20200717;

public class TryCatchEx03 {
	
	
	public static boolean divide(int num1,int num2) {
		
		try {
		
		int result = num1/num2;
		System.out.println("몫 : " +result);
		return true;
		
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			return false;
		}finally {
			System.out.println("finally : try~catch 후 무조건 실행되는 부분");
		}
	} // divide() end
	
	public static void main(String[] args) {
		boolean val = divide(400,20);
		
		if(val) {
			System.out.println("나눗셈 성공");
		}else {
			System.out.println("나눗셈 실패");
		}
		
		System.out.println("-----------------------------------");
		
		val = divide(400,0);
		if(val) {
			System.out.println("나눗셈 성공");
		}else {
			System.out.println("나눗셈 실패");
		}
		
		
		
	}

}
