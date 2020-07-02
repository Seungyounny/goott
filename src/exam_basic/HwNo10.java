package exam_basic;

import java.util.*; 

public class HwNo10 {

	
	//사용자로부터 값을 입력받아 해당 단을 출력하는 코드를 작성하시오
//	몇단? 3
//			3단 출력
			
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("몇 단 ? ");
		int in = sc.nextInt();
		
		System.out.println(in + " 단 출력");
		
		for(int i=1;i<=9;i++) {
			System.out.println(in + " * " + i + " = "+ in*i);
		}
	}
}
