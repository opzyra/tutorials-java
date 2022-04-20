import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 중첩 클래스 예시
 * JFrame => 자바 스윙컴포넌트(자바의 응용프로그램 같은 느낌)
 * 
 * 웹개발에서는 사용하지 않는다.
 * 중첩 클래스의 예시로만 확인
 * 
 * 추후에 배울 상속에 대한 개념도 포함되어있다.
 * 
 * */
class MyFrame extends JFrame {
	JButton btn = new JButton("닫기");
	public MyFrame(){
		setTitle("자바프레임");
		setSize(300,200);
		
		setLayout(new FlowLayout());
		btn.addActionListener(new ActionListener() { // 지역 중첩 클래스 + 익명중첩 클래스)
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		this.add(btn);
		
		
		
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Exam_02 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}
