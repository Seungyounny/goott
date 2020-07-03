package d20200703;

public class ArrayLotto {

	public static void main(String[] args) {
		// 로또번호 45개 중 6개 랜덤하게 출력

		int rnd []  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45};

		// System.out.println(Math.random());

		/*
		 * 0.0 < Math.random(); <1.0 : double type 값 리턴. 0.0 < Math.random()*10; <10.0 :
		 * double type 값 리턴. 0.0 < Math.random()*45; <45.0 : double type 값 리턴. ==>
		 * 44.9999999.....가 최댓값.
		 */

//		for(int i=1;i<6;i++) {
//			System.out.println((int)(Math.random()*45) );
//		}

		// rnd 값을 서로 바꾸면서 (중복 제거를 위해) 6개 번호 추출
		//int rnd[] = new int[45];

		for (int i = 0; i < 1000; i++) {
			int first = (int) (Math.random() * 45);
			int second = (int) (Math.random() * 45);

			int temp=0;
			
			 temp = rnd[first];
			rnd[first] = rnd[second];
			rnd[second] = temp;

		}

		for (int i = 0; i < 6; i++) {
			System.out.println(rnd[i]);
		}
	}
}
