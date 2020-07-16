package d20200713;

public class Horse extends 표유류 implements Flyable {
	
	int 다리;

	@Override
	public void 먹기() {
		// TODO Auto-generated method stub
		System.out.println("말은 당근을 먹어요.");
	}

	@Override
	public void 자기() {
		// TODO Auto-generated method stub
		System.out.println("말은 서서 자요.");
	}

	@Override
	public void 태생() {
		// TODO Auto-generated method stub
		System.out.println("말은 새끼를 낳아요");
	}
	
	public void 달리기() {
		System.out.println("말은 잘 달려요.");
	}

	@Override
	public void 비행() {
		// TODO Auto-generated method stub
		System.out.println("말이 날기 시작합니다.");
	}

}
