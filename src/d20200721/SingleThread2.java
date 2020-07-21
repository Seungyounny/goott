package d20200721;

import javax.swing.JOptionPane;

public class SingleThread2 {
	
	public static void main(String[] args) {
		
		String input =JOptionPane.showInputDialog("내용을 입력하세요");
		
		System.out.println("입력 값  : "+ input);
		
		for(int i=10;i>0;i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
					// TODO: handle exception
				};
			}
		}
	}

}
