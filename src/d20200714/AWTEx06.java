package d20200714;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 이벤트 처리
 * 1. 이벤트 소스 결정
 * 2. 이벤트 감지기 설치
 * 3. 헨들러 동작
 * 
 * 
 */

public class AWTEx06 extends Frame {
	Button btnYes, btnNo;
	
	public AWTEx06() {
		super("Event");
		
		setSize(400,300);
		setLocation(600, 300);
		setVisible(true);
		
		// Frame를 상속받으면 기본적으로 BorderLayout이 적용되고 있음 => 기본 배치 관리자
		
		// 기본 배치 관리자를 사용하지 않는다
		setLayout(null);
		
		btnYes = new Button("Yes");
		btnNo = new Button("No");
		
		// 배치관리자가 없어지면 모든 컴포넌트가 각각의 위치, 크기를 지정 가능
		btnYes.setSize(50, 20);
		btnYes.setLocation(30,60);
		
		btnNo.setSize(50,20);
		btnNo.setLocation(100, 60);
		
		add(btnYes);add(btnNo);
		
		// 자바 이벤트 감지기 : add ~~~ Listener
		
		Handler h1 = new Handler();
		
		btnYes.addActionListener(h1);
		
		Handler2 h2 = new Handler2();
		
		btnNo.addActionListener(h2);
		
	} // 생성자 end
	public static void main(String[] args) {
		new AWTEx06();
	}

} // class end

class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("왜 눌러~");
	}
	
}

class Handler2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("안녕히 계세요. ");
		System.exit(0);
		
		// 0 : 정상종료
		// 0 외 다른값을 사용 : 비정상 종료
	}
	
}
