package exam_basic;

public class HwNo9 {

	//구구단 2단 부터 9단까지 출력하는 코드를 작성하시오 
	
	public static void main(String[] args) {
		for(int i=2;i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				
				System.out.println(i + " * " + j + " = "+  i*j);
			}
			System.out.println();
		}
	}
}
