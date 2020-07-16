package d20200715;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AWTEx09 extends Frame implements ActionListener, WindowListener {
	
	Button b1 , b2;
	
	public AWTEx09() {
		super("Listner Test");
		setSize(400,300);
		setLocation(600,400);
		setVisible(true);
		
		setLayout(null);
		
		b1 = new Button("RED");
		b2 = new Button("BLUE");
		
		add(b1);add(b2);
		
		b1.setSize(200,100);
		b1.setLocation(0, 200);
		
		b2.setSize(200,100);
		b2.setLocation(200, 200);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		this.addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new AWTEx09();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("종료합니다.");
		System.exit(0);
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Click");
		String cmd = e.getActionCommand();
		//System.out.println("cmd : " +cmd);
		
		if(cmd.equals("RED")) {
			this.setBackground(Color.red);
		}else if(cmd.equals("BLUE")) {
			this.setBackground(Color.blue);
		}
	}

}
