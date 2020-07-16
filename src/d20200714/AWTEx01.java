package d20200714;

import java.awt.Frame;

// AWT : Abstract Window Toolkit

public class AWTEx01 extends Frame {
	
	AWTEx01(String title){
		
		super(title);
		
		// 창 크기 : 300, 300
		setSize(300, 300);
		
		// 창 위치 (x,y 좌표) : 400, 200
		setLocation(400, 200);
		
		// 창보기
		setVisible(true);
		
	}
	public static void main(String[] args) {
		AWTEx01 ae1 = new AWTEx01("내가 처음 만든 윈도우 창");
	}

}
