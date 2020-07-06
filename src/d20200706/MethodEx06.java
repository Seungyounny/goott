package d20200706;

public class MethodEx06 {
	
	 /*
	 * 
	 * 소수 출력하기
	 * : 소수 - 자기 자신과 1을 제외하고는 인수가 없는 (어떤 수로도 나눠지지 않는 수). 
	 * 
	 * 1) main() 에서 1이상 100이하의 값을 전부 찾고 그 중 소수만 전부 출력
	 * 2) isPrimeNumber () 를 통해 전달된 값이 소수인지 아닌지를 판단하여 true, false로 체크 
	 * 소수만 출력 
	 * 
	 */
	
	 static boolean isPrimeNumber(int num) {
		 //소수인지 판별
		 
		 
		 boolean chk =true;
		 
			for(int i=2;i<num;i++) {
				if(num%i==0) { //num을 2~num-1까지로 나눈 수 중에 나머지가 0인게 있으면 소수가 아님. chk=false 리턴.
					chk=false;
					break;
				}
			}
			return chk;
		}

	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			boolean prime= isPrimeNumber(i);
			if(prime==true) {
				System.out.print(prime+ "  ");
				System.out.println(i + "는 소수입니다.");
				
			}
			else {
				System.out.print(prime + "  ");
				System.out.println(i + "는 소수가 아닙니다.");
				
				
				
			}
		}
	}

	
}
