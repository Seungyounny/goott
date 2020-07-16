package d20200713;

public class 토끼 extends 표유류 {
	
	int 귀;

	@Override
	public void 먹기() {
		System.out.println("토끼는 배추를 먹어요. ");
		
	}

	@Override
	public void 자기() {
		System.out.println("토끼는 숲속에서 자요. ");
		
	}

	@Override
	public void 태생() {
		System.out.println("토끼는 새끼를 낳아요. ");
		
	}
	
	public void 점프() {
		System.out.println("토끼는 깡총깡총 뛰어요. ");
	}
	

}
