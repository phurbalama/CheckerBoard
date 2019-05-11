
import javax.swing.*;
import java.awt.*;
public class checkboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Checker Board");
		Color white = Color.WHITE;
		Color black = Color.BLACK;
		frame.setSize(600,600);
		JButton whitebtn = new JButton();
		JButton blackbtn = new JButton();
		whitebtn.setBackground(white);
		blackbtn.setBackground(black);
		
		for(int i = 0;i< 32;i++)
		{
			if(i<8) {
				frame.add(whitebtn);
				frame.add(blackbtn);
			}
			else if(i<16) {
				frame.add(blackbtn);
				frame.add(blackbtn);
			}
			else if(i<24) {
				frame.add(whitebtn);
				frame.add(blackbtn);
			}
			else if(i<32) {
				frame.add(blackbtn);
				frame.add(blackbtn);
			}
		}
		GridLayout grid = new GridLayout(8,8);
		frame.setLayout(grid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
