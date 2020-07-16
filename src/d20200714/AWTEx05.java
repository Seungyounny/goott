package d20200714;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

// GridLayout

public class AWTEx05 extends Frame {
Button btn1, btn2, btn3, btn4, btn5,btn6;
	
	public AWTEx05() {
		super("LayoutManger");
		setSize(400,300);
		setLocation(600,300);
		setVisible(true);
		
		// BordeLayout
		GridLayout g1 = new GridLayout(3,2);
		// 레이아웃을 적용
		setLayout(g1);
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		btn6 = new Button("CENTER2");
		// 컨테이너에 담고 아무런 크기, 위치를 지정하지 않으면 중앙에 겹쳐짐
		// : default가 BorderLayout이 적용됨
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		
		
		
		
	}
	public static void main(String[] args) {
		new AWTEx05();
	}

}
