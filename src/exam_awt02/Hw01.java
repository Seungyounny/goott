package exam_awt02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Hw01 extends Frame implements KeyListener {

	Button b1, b2, b3,b4, b5, b6;
	
	public Hw01() {
		super("ButtonMove");
		 setSize(1000,1000);
	      setLayout(null);
	      setVisible(true);
	      
	      b1 = new Button("^__^");
	      b1.setBounds(300, 180, 80, 60);
	      
	      b2 = new Button("BODY");
	      b2.setBounds(300, 235, 80, 200);
	      
	      b3 = new Button("R_LEG");
	      b3.setBounds(300, 435, 35, 90);
	      
	      b4 = new Button("L_LEG");
	      b4.setBounds(340, 430, 35, 90);
	      
	      b5 = new Button("R_HAND");
	      b5.setBounds(200, 235, 100, 50);
	      
	      b6 = new Button("L_HAND");
	      b6.setBounds(380, 235, 100, 50);
	      
	      add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);
	      
	      this.addWindowListener(new WindowAdapter() {
	    	  
	    	 @Override
	    	public void windowClosing(WindowEvent e) {
	    		// TODO Auto-generated method stub
	    		super.windowClosing(e);
	    		System.exit(0);
	    	}
	    	  
	    	  
		});
	      b1.addKeyListener(this);
	}
	//생성자 끝 
	
	public static void main(String[] args) {
		new Hw01();
	}

	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key= e.getKeyCode();
		
		System.out.println("key : " + key);

		// 키보드 한번 눌렀을 때 6개의 버튼이 모두 이동
		//각 버튼의 좌표 -> 모두 이동 -> 배열 
	
		//좌표만 넣어줌 
		int x[] = {b1.getX(), b2.getX(),b3.getX(),b4.getX(),b5.getX(),b6.getX()};
		int y[]= {b1.getY(),b2.getY(),b3.getY(),b4.getY(),b5.getY(),b6.getY()};
		
		Button [] btn = {b1,b2,b3,b4,b5,b6};
		
		
		if(key==37) {
			for(int i=0;i<x.length;i++) {
				x[i]-=10;
				y[i]=y[i];
				
			}
			//움직이라구 명령 
//			b1.setLocation(x[0],y[0]);
//			b2.setLocation(x[1],y[1]);
//			b3.setLocation(x[2],y[2]);
//			b4.setLocation(x[3],y[3]);
//			b5.setLocation(x[4],y[4]);
//			b6.setLocation(x[5],y[5]);
			//이러케 한거를 한번에 해보리기 
			
			for(int i=0;i<btn.length;i++) {
				btn[i].setLocation(x[i],y[i]);
			}
			
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	
}
