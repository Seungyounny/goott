package d20200713;

public class 고래 extends 표유류 {
	
	int 나이;

	@Override
	public void 먹기() {
		System.out.println("고래는 새우를 먹어요. ");
		
	}

	@Override
	public void 자기() {
		System.out.println("고래는 선잠을 자요. ");
		
	}

	@Override
	public void 태생() {
		System.out.println("고래는 새끼를 낳아요. ");
		
	}
	
	public void 헤엄치기() {
		System.out.println("고래는 평생 헤엄쳐요. ");
	}

}
