package exam_basic2;

import java.util.*;

public class HwNo1 {
	
	/*
	 * 사용자로부터 입력받은 값이 3의 배수인지 아닌지 출력
     ex1) 입력: 9
     9는 3의배수입니다.
     ex2) 입력: 7
     7은 3의배수가 아닙니다.
     
	 */

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.print("입력 : ");
		int in=sc.nextInt();
	
		if(in%3==0) {
			System.out.println(in + "은 3의 배수입니다.");
			
		}else {
			System.out.println(in + "은 3의 배수가 아닙니다.");
		}
	}
}
