package d20200720;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 이벤트 처리
// 1. 이벤트 소스 결정
// 2. 감지기 매칭
// 3. 핸들러작성

public class SwingEx01 extends JFrame implements ActionListener{
	JButton jbtn;
	JLabel jlabel;
	
	
	public SwingEx01() {
		super("Action event");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jbtn = new JButton("click");
		add(jbtn);
		
		jbtn.addActionListener(this);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingEx01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("click event");
	}

}
