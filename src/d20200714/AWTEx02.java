package d20200714;

import java.awt.Button;
import java.awt.Frame;

// 윈도우를 구성하는 모든 요소 : component
// container : 다른 component를 담을 수 있는 component

public class AWTEx02 extends Frame {
	
	Button btn;
	
	AWTEx02(String title){
		//super(title);
		
		setTitle(title);
		
		// 사이즈 : 400,200
		setSize(400,200);
		
		// 위치 : 597,289
		setLocation(597,289);
		
		btn = new Button("Click~"); // 크기 지정안해서 화면에 꽉차게 나옴
		
		// component는 컨테이너에 담아야 사용할 수 있음
		add(btn);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		AWTEx02 ae2 = new AWTEx02("버튼이 있는 윈도우 창");
	}

}
