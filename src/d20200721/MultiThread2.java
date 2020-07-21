package d20200721;

import javax.swing.JOptionPane;

//현 클래스를 실행하면 팝업창을 띄우면서 동시에 반복문을 구동해 보세요 
public class MultiThread2 {

	public static void main(String[] args) {
		new ThreadDemo1().start();
		
		String input =JOptionPane.showInputDialog("내용을 입력하세요");
		System.out.println("입력값 : "+ input);
	}
}

class ThreadDemo1 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 10; i > 0; i--) {
			System.out.println(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}