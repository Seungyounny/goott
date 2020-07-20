package d20200717;

public class ExceptionThrows {
	
	public static void prt() throws NumberFormatException {
		
		String[] str = {"9","300","150","200","a"};
		
		int sum = 0;
		
		for(int i=0;i<str.length;i++) {
			sum += Integer.parseInt(str[i]);
		}
		
		System.out.println("sum : " +sum);
		
	}
	
	public static void main(String[] args) {
		try {
		prt();
		}catch(NumberFormatException e) {
			System.out.println("에러 발생");
			System.out.println(e.getMessage());
			for(StackTraceElement string : e.getStackTrace()) {
				System.out.println(string.toString());
			}
		}
	}

}
