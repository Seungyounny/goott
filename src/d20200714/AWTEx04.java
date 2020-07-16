package d20200714;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

// FlowLayout : 물 흐르듯 레이아웃 생성

public class AWTEx04 extends Frame {
Button btn1, btn2, btn3, btn4, btn5;
	
	public AWTEx04() {
		super("LayoutManger");
		setSize(400,300);
		setLocation(600,300);
		setVisible(true);
		
		// BordeLayout
		FlowLayout f1 = new FlowLayout();
		// 레이아웃을 적용
		setLayout(f1);
		
		btn1 = new Button("EAST");
		btn2 = new Button("WEST");
		btn3 = new Button("SOUTH");
		btn4 = new Button("NORTH");
		btn5 = new Button("CENTER");
		
		// 컨테이너에 담고 아무런 크기, 위치를 지정하지 않으면 중앙에 겹쳐짐
		// : default가 BorderLayout이 적용됨
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		
		
	}
	public static void main(String[] args) {
		new AWTEx04();
	}

}
