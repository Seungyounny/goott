package d20200701;
//switch문
//상대적으로 if문 보다 빠르다
//switch문의 조건은 제한적이지만 if문보다 조건을 파악하기 쉽다
//switch문의 key값이 필요 (보통 정수,문자와 열거형도 허용)
public class SwitchEx01 {
	public static void main(String[] args) {
		//1부터 5까지 숫자정보가 생성되면 해당 요일을 영문으로 출력
		int key = 3;
		String day = "";
		
		// 최종 충력 : Today is ~~.
		
		switch(key) {
		case 1 :
			day = "MON";
			break;
		case 2 :
			day = "TUE";
			break;
		case 3 :
			day = "WED";
			break;
		case 4 :
			day = "THU";
			break;
		case 5 :
			day = "FRI";
			break;
		default :
			System.out.println("숫자를 잘못 선택하셨습니다.");
		} // switch end
		System.out.println("Today is " +day);
	}
;
}
