package d20200715;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTEx11 extends Frame implements MouseMotionListener   {
	
	Button b1;
	Label lb;
	
	public AWTEx11() {
		super("MovingButton");
		setBounds(30,30,1200,800);
		setLayout(null);
		setVisible(true);
		
		
		b1 = new Button("^__^;;");
		lb = new Label("Catch me if you can..");
		
		b1.setBounds(80, 60, 80, 60);
		lb.setBounds(100, 200, 200, 40);
		add(b1);
		add(lb);
		this.addMouseMotionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	} // 생성자 end
	public static void main(String[] args) {
		new AWTEx11();
	} // main end
	

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("e : " +e);
		
		// 마우스 현재 좌표
		int x = e.getX();
		int y = e.getY();
		
		// 버튼 현재 좌표
		int bx = b1.getX();
		int by = b1.getY();
		
		// 버튼 기준점 -> 정중앙
		bx += 40;
		by += 30;
		//System.out.println("" +x + "," +y);
		
		// 마우스와 현재 버튼 사이의 직선 거리 : a^2 + b^2 = c^2
		double dis = Math.sqrt((bx-x)*(bx-x) + (by-y)*(by-y));
		// sqrt() : double type값을 return 받는 함수
		if(dis<90) {
			System.out.println("거의 가까이 옴");
		}else {
			System.out.println("아직 멀다");
		}
		if(dis < 90) {
			b1.setLocation(
					(int)(Math.random()*1000), 
					(int)(Math.random()*680));
			
		}
	}

}
