package d20200715;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx08 extends Frame implements WindowListener {
	public AWTEx08() {
		super("Window test");
		setSize(400,300);
		setLocation(600,300);
		setVisible(true);
		
		this.addWindowListener(this);
	} // 생성자 end
	
	public static void main(String[] args) {
		new AWTEx08();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		// 현재 클래스 구조 상 확인할 수는 없음
		System.out.println("윈도우 창이 열리면 호출");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우가 종료될 때 호출");
		System.out.println("필요한 활동을 수행하고 종료");
		
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		// 현재 클래스 구조상으로는 확인할 수 없음
		System.out.println("프로그램이 종료된 후에 호출");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("윈도우 창이 아이콘화 되었을 때 호출");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("아이콘화를 되돌렸을 때 호출");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("활성화 되었을 때 호출");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("비활성화 되었을 때 호출");
	}

}
