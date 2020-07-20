package d20200720;



import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// key event

public class SwingEx02 extends JFrame {
	JPanel jp;
	JLabel[] msg;
	
	public SwingEx02() {
		super("key evnet");
		
		jp = new JPanel();	
		
		setContentPane(jp);
		
		jp.setBackground(Color.black);
		msg = new JLabel[3];
		msg[0] = new JLabel("keycode 값");
		msg[1] = new JLabel("char 값");
		msg[2] = new JLabel("keyBoard 값");
		
		for(int i=0; i<msg.length;i++) {
			jp.add(msg[i]);
			
			msg[i].setOpaque(true);
			msg[i].setBackground(Color.WHITE);
		}
		
		setBounds(400, 300, 500, 500);
		setVisible(true);
		
		Handler h = new Handler();
		jp.addKeyListener(h);
		
		jp.requestFocus(); // 이벤트를 바로 인식할 수 있도록 하기 위해 focus를 줌
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	} // 생성자 end
	
	class Handler extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			//super.keyPressed(e);
			
			int keycode = e.getKeyCode();     // ASCII
			char keychar = e.getKeyChar();	  // UNICODE
			
			msg[0].setText(Integer.toString(keycode));
			msg[1].setText(Character.toString(keychar));
			msg[2].setText(e.getKeyText(keycode));
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new SwingEx02();
		
	}

}// class end
