package d20200706;



/* 
 * 임의의 원의 반지름 정보를 전달하면
 * 
 * 1) 원의 넓이를 계산 해서 반환하는 메소드 생성 -결과 출력
 * 		반지름은 : 12.2
 * 
 * 2) 원의 둘레를 계산해서 반환하는 메소드 생성 - 결과 출력 
 * 		반지름 : 7.6
 * 
 * 
 */

public class MethodEx05 {
	
	void dimen(double d) {
		System.out.println("넓이는 : " +d*d*3.14);
	}
	
	void round (double d) {
		System.out.println("둘레는 : " +2*d*3.14);
	}
	
	
	public static void main(String[] args) {
		MethodEx05 me5 =new MethodEx05();
		me5.dimen(12.2);
		me5.round(7.6);
		
	}

}
