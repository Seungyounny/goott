package d20200713;

public class ReferenceArr {
	public static void main(String[] args) {
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 s = new 다람쥐();
		
		// 포유류가 먹기 수행하기
//		r.먹기();
//		w.먹기();
//		s.먹기();   => 한번에 할 수 있지 않을까?
		
		/*
		 * primitive type 배열
		 * 
		 * int [] m = new int[3];
		 * 
		 * int [] m = { , , ,};
		 * 
		 * - reference type 배열도 가능
		 * 
		 */
//		표유류[] moList = new 표유류[3]; // 메모리 공간 만들 때는 가능
//		moList[0] = r;
//		moList[1] = w;
//		moList[2] = s;
		
		표유류[] moList = {r,w,s};
		
		
		for(int i=0; i<moList.length;i++) {
			moList[i].먹기();
			moList[i].자기();		
		}
		
		System.out.println("--------------");
		// 참조변수의 원객체 여부를 확인하고 싶을 때 : instanceof -- t/f
		System.out.println(r instanceof 토끼);
		
		
		
	}
}
