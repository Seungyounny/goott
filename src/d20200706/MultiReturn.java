package d20200706;

//id (java) pw (1234) 받아서 로그인 하기 

import java.util.*;


public class MultiReturn {

	
	public static void main(String[] args) {
		System.out.println("로그인 하시겠습니까?");
		
		Scanner sc =new Scanner (System.in);
		System.out.println("ID를  입력하세요 :  ");
		String id = sc.nextLine();
		
		System.out.println("pw를 입력하세요 : ");
		int pw = sc.nextInt();
		
		System.out.println("id : " + id + " , pw : "+ pw);
		
		//login 기능 수행 (실행)
		LoginTest lt=new LoginTest();
		boolean login = lt.loginCheck(id, pw);
		lt.loginMessage(login);
	//	LoginTest lt=new LoginTest().loginMessage(lt.loginCheck(id,pw));
		
		
	} //main end
}//MultiReturn class End


class LoginTest{
	//id, pw 정확한지 check
	public boolean loginCheck(String id, int pw) {
		//id가 java, pw가 1234 이면 true, 아니면 false 
		
		boolean login = false;
		
		if(id.equals("java")&&pw==1234){
			login= true;
		}
		return login;
		
	}//loginCheck end
	
	public void loginMessage(boolean check) {
		if(check) {
			System.out.println("로그인 성공 ");
			
		}else {
			System.out.println("로그인 실패했습니다");
		}
	}
	//정확하면 로그인 기능했습니다 출력 
	
	
	
	
	
}//LoginTest class 