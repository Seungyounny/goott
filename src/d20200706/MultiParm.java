package d20200706;

import java.util.*;

public class MultiParm {
	//login 기능
	
	void loginDemo(String id, int pw) {
		//id 가 java 이고 pw 가 1234 면 로그인 성공 메시지 출력
		
		if(id.equals("java") && pw ==1234 ) {
			System.out.println("로그인 성공 했습니다.");
		}else {
			System.out.println("회원 가입 하세요 ");
		}
	}
	
	public static void main(String[] args) {
		
	System.out.println("로그인 하시겠습니까?");
	Scanner sc =new Scanner (System.in);
	
	System.out.println("아이디를 입력하세요");
	String id = sc.nextLine();
	
	System.out.println("패스워드를 입력하세요 ");
	int pw = sc.nextInt();
	
	
	//로그인 기능 수행
	
	MultiParm mp =new MultiParm();
	mp.loginDemo(id, pw);//파라미터의 형태를 맞추어서 선언해야 오류가 안남
	}

}
