package d20200715;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import sun.awt.AWTAccessor.KeyboardFocusManagerAccessor;

public class AWTEx10 extends Frame implements KeyListener,WindowListener{
	Button btn;
	
	public AWTEx10() {
		super("ButtonControl");
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		
		btn = new Button("^.^");
//		btn.setSize(50,50);
//		btn.setLocation(400,300);
		
		btn.setBounds(400, 300, 50, 50);
		
		add(btn);
		
		btn.addKeyListener(this);
		this.addWindowListener(new WindowAdapter() { // 익명 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("종료합니다.");
				System.exit(0);
			}
		});
		
		
	}//생성자 엔드
	
	public static void main(String[] args) {
		new AWTEx10();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("e : " +e);
		
		int key = e.getKeyCode(); // 아스키코드로 바꿔줌
		
		System.out.println("key : " +key);
		
		// 버튼 현재 좌표
		int x = btn.getX();
		int y = btn.getY();
		
		//System.out.println("x , y = " +x +y);
		
		if(key==37) {
			//System.out.println("left move");
			x -= 10;
		}else if(key==38) {
			y -= 10;
		}else if(key==39) {
			x += 10;
		}else if(key==40) {
			y += 10;
		}
		btn.setLocation(x, y);
		if(key==32) {
			for(int i =0; i<7;i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  // milli : 1/1000초
				btn.setLocation(btn.getX()+10, btn.getY()-10);
			}
			for(int i=0;i<7;i++) {
				btn.setLocation(btn.getX()+10, btn.getY()+10);
			}
			
		}
		//System.out.println("x , y = " +x +y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}




}
