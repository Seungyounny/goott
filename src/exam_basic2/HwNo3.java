package exam_basic2;

public class HwNo3 {
	
	//3. 두개 주사위를 던졌을때 합이 4가 되는 모든 경우의수를 출력하는 프로그램을 작성하시오.
	
	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j==4) {
					System.out.println(i + " "+ j );
				}
			}
		}
	}

}
