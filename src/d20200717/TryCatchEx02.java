package d20200717;

import java.util.Scanner;

// 하나의 try에 둘 이상의 exception이 발생할 수 있음. 둘 이상의 catch 영역을 구성할 수 있음
// => 예외처리를 위한 코드를 완전히 별도로 구성(권장사항)

public class TryCatchEx02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];
		
		for(int i=0;i<3;i++) {
			
			try {
			
			System.out.println("피제수 입력 : ");
			int num1 = sc.nextInt();
			
			System.out.println("제수 입력 : ");
			int num2 = sc.nextInt();
			
			System.out.println("연산의 결과를 저장할 배열의 인덱스 입력 : ");
			int idx = sc.nextInt();
			
			arr[idx] = num1/num2;
			
			System.out.println("나눗셈의 결과 : " +(arr[idx]));
			System.out.println("저장된 인덱스 번호 : " +idx);
			}catch(ArithmeticException e) {
				System.out.println("제수가 0이면 안돼요~");
				System.out.println(e.getMessage());
				i -= 1;
				continue;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("유효하지 않은 인덱스 번호입니다.");
				System.out.println(e.getMessage());
				i -= 1;
			}
		}
	}

}
