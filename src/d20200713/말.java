package d20200713;

public class 말 extends 표유류 {
	
	int 다리;

	@Override
	public void 먹기() {
		System.out.println("말은 풀을 먹어요. ");

	}

	@Override
	public void 자기() {
		System.out.println("말은 풀에서 자요. ");

	}

	@Override
	public void 태생() {
		System.out.println("말은 새끼를 낳아요. ");

	}
	
	public void 달리기() {
		System.out.println("말은 달리기를 잘해요. ");
	}

}
