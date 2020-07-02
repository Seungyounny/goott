package exam_basic;

import java.util.*;

public class HwNo7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println(" 몇 줄 출력? ");
		int input=sc.nextInt();
		
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
