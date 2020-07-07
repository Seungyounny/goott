package exam_basic2;

import java.util.*;

public class HwNo6 {

//	6. 화페교환기
//
//	사용자로부터 숫자를 입력받아  화폐 몇장으로 교환가능한지 메세지를 출력하시는 코드를 작성하시오
//	ex) 78500
//	오만원권 1장
//	만원권  2장
//	오천원권 1장
//	천원권 3장
//	오백원권 1장
//	백원권 0장
//	오십원권 0장

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 ");
		int money = sc.nextInt();

		int fiveman = 0;// 오만
		int man = 0; // 만
		int fiveth = 0;// 오천
		int th = 0;// 천
		int fivehun = 0;// 오백
		int hun = 0;// 백
		int fif = 0;// 오십

		while (money != 0) {
			if (money / 50000 > 0) {
				fiveman = money / 50000;
				money = money % 50000;

			} else if (money / 10000 > 0) {
				man = money / 10000;
				money = money % 10000;
				
			}else if (money / 5000 > 0) {
				fiveth = money / 5000;
				money = money % 5000;
			}
			else if (money / 1000 > 0) {
				th = money / 1000;
				money = money % 1000;
			}
			else if (money / 500 > 0) {
				fivehun = money / 500;
				money = money % 500;
			}
			else if (money / 100 > 0) {
				hun = money / 100;
				money = money % 100;
			}
			else if (money / 50 > 0) {
				fif = money / 50;
				money = money % 50;
			}
			
			

		}
		System.out.println("오만원권  " + fiveman+ " 장");
		System.out.println("만원권     " + man+ " 장");
		System.out.println("오천원권  " + fiveth+ " 장");
		System.out.println("천원권     " + th+ " 장");
		System.out.println("오백원권  " + fivehun+ " 장");
		System.out.println("백원권     " + hun+ " 장");
		System.out.println("오십원권  " + fif+ " 장");

	}

}
