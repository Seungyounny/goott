package exam_awt02;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Hw03 extends Frame implements ActionListener {
	
	Label lb1, lb2;
	Button b1, b2;
	TextField tf1, tf2;
	
	
	public Hw03() {
		
		super("Login Form");
		setSize(800,600);
		setLayout(null);
		setVisible(true);
		
		lb1 =new Label("ID : ");
		lb2= new Label("PW : ");
		
		lb1.setBounds(100, 100, 80, 40);
		lb2.setBounds(100, 150, 80, 40);
		
		add(lb1);
		add(lb2);
		
		
		tf1 = new TextField("only eng");
		tf2 = new TextField("Required - 8자 이상 ");
		
		tf1.setBounds(200, 100, 200, 40);
		tf2.setBounds(200, 150, 200, 40);
		
		add(tf1);
		add(tf2);
		
		b1 =new Button("Login");
		b2=new Button("Register");
		
		b1.setBounds(150, 250, 80, 60);
		b2.setBounds(250, 250, 80, 60);
		
		add(b1);
		add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object obj = e.getSource();
		if(obj==b1) {
			//DBMS에 접근해서 비교한 후 (사용자가 입력한 id가 내 DBMS에 있으면 ) 로그인 기능 수행 
			
			System.out.println(tf1.getText() + "님이 로그인 하셨습니다.");
			System.out.println(tf2.getText() + " 비번 입력하셨습니다 ");
			
			String value = tf1.getText();
			b1.setLabel(value);
		}
		else if(obj==b2) {
			System.out.println("회원가입 창으로 이동 ");
		}
	}
	public static void main(String[] args) {
		new Hw03();
		
	}

}
