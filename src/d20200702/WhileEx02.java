package d20200702;

public class WhileEx02 {

	
	public static void main(String[] args) {
		
		//1 부터 100까지 합을 while로 
		
//		int i=1;
//		int sum=0;
//		while(i<100) {
//			sum+=i;
//			i++;
//			System.out.println(i);
//		}
//		System.out.println(sum);
		
		
		
		//1~100까지 출력. 1. while 2. do-while  변수 한개만
		
		int j=1;
		while(j<=100) {
			System.out.println(j);
			j++;
		}
//		
		do {
			System.out.println(--j);
		
		}while(j>1);
		
		
	}
	
	
}
