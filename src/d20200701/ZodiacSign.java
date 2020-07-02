package d20200701;

import java.util.Scanner;

// 사용자로부터 태어난 년도를 4자리로 입력받은 후
// 당신은 ~~띠 입니다. => 출력

//자축인묘 진사오미 신유술해
//쥐,소,호랑이,토끼, 용,뱀,말,양,  원숭이,닭,개,돼지
//4 5 6 7  8 9 10 11  12 1 2 3

public class ZodiacSign {
	public static void main(String[] args) {
		System.out.println("당신의 태어난 연도 4자리를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		System.out.println("태어난 연도는 : " + year);
		
		String [] zod = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		
		for(int i=0; i<=11; i++) {
			if(year % 12 == i) {
				System.out.println("당신은 " + zod[i] + "띠 입니다.");
			}
		}
			
	}

}
