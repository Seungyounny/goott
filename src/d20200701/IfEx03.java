package d20200701;

public class IfEx03 {
	public static void main(String[] args) {
		
		int num1 = -25;
		int num2 = 230;
		
		int big;
		
		// 두 값 중 큰 값을 구해서big이라는 변수에 담아 출력
		if(num1 > num2) {
			big = num1;
			System.out.println("big : " +big);
		}else {
			big = num2;
			System.out.println("big : " +big);
		}
		System.out.println("------------------");
		
		// 두 수의 차이(절대값) 구해보세요
		// 절대값 : 큰수 - 작은 수
//		int absnum = num1 - num2;
//		if (absnum >=0) {
//			System.out.println(absnum);
//		}else {
//			absnum = -absnum;
//			System.out.println(absnum);
//		}
		int dif;
		
		if(num1 > num2) {
			dif = num1 - num2;
			System.out.println(dif);
		}else {
			dif = num2 - num1;
			System.out.println(dif);
		}
		
	}

}
