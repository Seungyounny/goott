package d20200713;

public class 다람쥐 extends 표유류 {
	int 꼬리;

	@Override
	public void 먹기() {
		System.out.println("도토리를 먹어요. ");
		
	}

	@Override
	public void 자기() {
		System.out.println("다람쥐는 나무 위에서 자요. ");
		
	}

	@Override
	public void 태생() {
		System.out.println("다람쥐는 새끼를 낳아요. ");
		
	}
	
	public void 나무오르기() {
		System.out.println("다람쥐는 나무에 올라요.");
	}

}
