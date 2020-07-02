package exam_basic;

import java.util.*;

public class HwNo11 {
	
	// 1부터 입력한 숫자까지의 누적합을 출력하시요
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println("얼마 ? ");
		int in=sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=in;i++) {
			sum+=i;
			
		}
		System.out.println(" 1부터 "+ in + "까지의 합은 "+ sum + "입니다");
	}

}
