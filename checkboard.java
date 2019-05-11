
import javax.swing.*;
import java.awt.*;
public class checkboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Checker Board");
		Color white = Color.WHITE;
		Color black = Color.BLACK;
		frame.setSize(600,600);
		
		for(int row = 0;i< 8;i++)
		{
			
			for(int column = 0;i<8;i++)
			{
			JButton whitebtn = new JButton();
			JButton blackbtn = new JButton();
			whitebtn.setBackground(white);
			blackbtn.setBackground(black);
			if(i % 2 == 0)
			{
				frame.add(whitebtn);
				frame.add(blackbtn);
			}
			else
			{
				frame.add(blackbtn);
				frame.add(blackbtn);
			}
				
			}	
			
		}
		GridLayout grid = new GridLayout(8,8);
		frame.setLayout(grid);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
