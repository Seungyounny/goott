package d20200721;

public class SingleThread {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();// 현재 시각정보를 1/1000로 표시 . 단위수가 크기때문에 long 으로 받음

		System.out.println(startTime);

		for (int i = 0; i < 100; i++) {
			System.out.println("*");
		}

		System.out.println("수행 시간 : " + (System.currentTimeMillis() - startTime));

		startTime = System.currentTimeMillis(); //밑에의 수행시간만을 구하고 싶을 때 다시 선언해줘야 하기 때문에 시간이 더 오래걸림

		for (int i = 0; i < 100; i++) {
			System.out.println("#");
		}

		System.out.println("수행시간 : " + (System.currentTimeMillis() - startTime)); // 이렇게 쓰면, 위에 애가 끝날 때 까지 밑에가 실행 안하므로,
																					// 기다리고 있기 때문에, 시간이 합쳐져서 계산이 된다! !
		// 싱글 스레드는 순차대로 수행

	}

}
