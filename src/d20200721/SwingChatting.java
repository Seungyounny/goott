package d20200721;

import java.awt.Color;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * a.k.a 심심이
 * 
 * title : 심심이 ver 0.01
 * size  : 600*400;
 * x	 : 종료 가능
 * GUI 	 : Swing
 * 기본기능: text area, text field, key event, button, action event, panel
 * 추가기능: 스크롤 기능(패널), textfield 지우기 기능
 * 	 
 * */

public class SwingChatting extends JFrame implements ActionListener, KeyListener {

	String[] str = { "오늘은 화요일이야", "안녕하세요", "심심해", "밥은 먹고 다니니?", "부모님은 잘 계시니?", "오늘 뭐 먹지?", "날씨가 미쳤어", "힘내 할 수 있어",
			"미친거 아냐?", "안뇽" };
	JTextArea jta; // 글이 써지는 공간
	JTextField jtf;// 내가 글을 쓰는 공간
	JButton jbtn;

	// 사용자 입력을 받는 컴포넌트를 부착할 패널
	JPanel jp;
	JScrollPane jsp; // 추가기능 --> 스크롤 기능

	public SwingChatting() {
		super("심심이 ver 0.01");
		setBounds(300, 300, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jta = new JTextArea(); // 프레임에 텍스트 에어리어

		jp = new JPanel();

		jtf = new JTextField(40);
		jbtn = new JButton("Insert");

		jsp = new JScrollPane(jta, jsp.VERTICAL_SCROLLBAR_AS_NEEDED, jsp.HORIZONTAL_SCROLLBAR_AS_NEEDED);// 필요할 때 스크롤 사용

		
		//색상 지정  Color : R(red), G(green) , B(blue) 
		//0 ~ 255

		Color c = new Color(255,255,35);
		jp.setBackground(c);
		
		jta.setBackground(Color.white); //이렇게 하면 원래 지정되어 있는 색깔로 
		// 컨테이너에 textarea 부착
		this.add(jsp, "Center");

		// 컨테이너에 panel 부착<- 패널에 textfield 와 button 부착

		jp.add(jtf);
		jp.add(jbtn);
		
		this.add(jp,"South");
		
		jtf.addKeyListener(this);
		jbtn.addActionListener(this);
		
		setVisible(true);
	}//생성자 end
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int key =e.getKeyCode();
		if(key==e.VK_ENTER) {
			appendData();
			//엔터가 들어오면 appenddata
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		appendData();

	}

	public static void main(String[] args) {
		new SwingChatting();
		
	}//main
	//심심이가 말하는 기능
	private void makeWord() {
		Random rnd=new Random();
		int value =rnd.nextInt(str.length);
		
		jta.append("심심이 : "+ str[value]+"\n");
	}
	
	
	//사용자 대화 처리
	private void appendData() {
		String txt=jtf.getText();
		jta.append("사용자: "+ txt + "\n");
		
		makeWord();
		jtf.setText(""); //한번 하고 나면 
	}

}
