package d20200714;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

// Layout Manager : 배치관리자
// - 컨테이너는 컴포넌트를 어떻게 배치해야할 지 도와주는 배치관리자가 있음

public class AWTEx03 extends Frame {
	Button btn1, btn2, btn3, btn4, btn5;
	
	public AWTEx03() {
		super("LayoutManger");
		setSize(400,300);
		setLocation(600,300);
		setVisible(true);
		
		// BordeLayout
		BorderLayout b1 = new BorderLayout();
		// 레이아웃을 적용
		setLayout(b1);
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		// 컨테이너에 담고 아무런 크기, 위치를 지정하지 않으면 중앙에 겹쳐짐
		// : default가 BorderLayout이 적용됨
		
		add(btn1,b1.EAST);
		add(btn2,b1.WEST);
		add(btn3,b1.SOUTH);
		add(btn4,b1.NORTH);
		add(btn5,b1.CENTER);
		
		
		
	}
	public static void main(String[] args) {
		new AWTEx03();
	}
	
	
	

}
