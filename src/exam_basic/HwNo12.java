package exam_basic;

public class HwNo12 {
	
	/*
	 *  다음 식을 만족하는 모든 A와 B의 조합을 구하세요
		  
		     A   B
		  +  B   A
		  ------------
		     9   9


	 */
	public static void main(String[] args) {
		
		for(int i=10;i<100;i++) {
			int a= i/10;
			int b =i%10;
			
			int num= b*10 + a;
			//System.out.println(i + " " + num);
			if(i+num==99) {
				System.out.println(i + " " + num);
			}
		}
		
	}

}
