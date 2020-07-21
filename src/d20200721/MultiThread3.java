package d20200721;

import javax.swing.JOptionPane;

public class MultiThread3 {

	static boolean chk = false;

	public static void main(String[] args) {
		new ThreadDemo2().start();
		new ThreadDemo3().start();

	}

}

//10초 수행 후 프로그램 종료
class ThreadDemo2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			if (MultiThread3.chk) {
				System.out.println(MultiThread3.chk);
				System.out.println("입력되었습니다. 인증되었습니다. 프로그램을 종료합니다.");
				return;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} // for

		System.out.println("10초가 지났습니다. 미인증 되었습니다. 프로그램을 종료합니다");
		System.exit(0);

	}

}
//사용자로부터 입력값을 부여받는 코드

class ThreadDemo3 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("10초안에 입력하세요");
		String input = JOptionPane.showInputDialog("인증번호를 입력하세요");

		MultiThread3.chk = true;
		System.out.println("인증값 : " + input);
	}

}