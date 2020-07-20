package d20200720;

import java.util.Calendar;

public class UtilEx03 {
	public static void main(String[] args) {
		//Calendar cal = new Calendar();
		
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " +cal);
		
		// getter나 상수로 호출해서 사용
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("이번 주는 올해의 " +week + " 번째 주입니다.");
		
		// 년, 월, 일, 시, 분, 초 출력
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get((Calendar.MONTH)+1);
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(y +" " +m +" " +d +" " +h + " " +min +" " +s);

		
	}

}
