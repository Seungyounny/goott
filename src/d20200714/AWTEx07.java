package d20200714;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEx07 extends Frame implements ActionListener {
	
	// 핸들러 객체를 따로 만들지 않고 현재 내 구현클래스에 바로 적용
	// 다만, 이벤트가 많거나 로직이 복잡해지면 핸들러 객체를 따로 만들어서 사용하는 것을 권장
	
	Button btn;
	
	public AWTEx07() {
		
		super("Event2");
		setSize(400,300);
		setLocation(600, 300);
		setVisible(true);
		
		btn = new Button("Click");
		add(btn,"South");
		
		// 이벤트 소스 결정, 감지기 부착, 핸들러 적용
		btn.addActionListener(this);
}
	public static void main(String[] args) {
		new AWTEx07();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("wow");
		
		System.out.println(e.getSource());
		
		Object obj = e.getSource();
		
		if(obj==btn) {
			setBackground(Color.CYAN);
		}
	}
	
	
	
	
}
