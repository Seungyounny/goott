package d20200713;

public class AbstractMain {
	public static void main(String[] args) {
		//포유류 po = new 표유류();
		
		토끼 r = new 토끼();
		고래 w = new 고래();
		다람쥐 s = new 다람쥐();
		말 h = new 말();
		
		r.먹기();
		w.헤엄치기();
		s.나무오르기();
		
		System.out.println("-------------------");
		// 말 한마리 만들어서 말이 먹고, 달리기 해보세요
		h.먹기();
		h.달리기();
	}

}
