import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class usflag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	JFrame frame = new JFrame("U.S");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		    Container content = frame.getContentPane();
		    content.setLayout(new GridLayout(1, 4));

		    Border border = LineBorder.createGrayLineBorder();
		    Icon icon = new ImageIcon("us.jpg");

		    JLabel label1 = new JLabel(icon);
		    label1.setText("U.S");
		    label1.setVerticalTextPosition(JLabel.BOTTOM);
		    label1.setHorizontalTextPosition(JLabel.LEFT);
		    label1.setBorder(border);
		    content.add(label1);

		    JLabel label2 = new JLabel(icon);
		    label2.setText("U.S");
		    label2.setHorizontalTextPosition(JLabel.RIGHT);
		    label2.setVerticalTextPosition(JLabel.TOP);
		    label2.setBorder(border);
		    content.add(label2);

		    JLabel label3 = new JLabel(icon);
		    label3.setText("U.S");
		    label3.setHorizontalTextPosition(JLabel.CENTER);
		    label3.setVerticalTextPosition(JLabel.CENTER);
		    label3.setBorder(border);
		    content.add(label3);

		    JLabel label4 = new JLabel(icon);
		    label4.setText("U.S");
		    label4.setHorizontalTextPosition(JLabel.CENTER);
		    label4.setVerticalTextPosition(JLabel.BOTTOM);
		    label4.setBorder(border);
		    content.add(label4);

		    frame.setSize(700, 200);
		    frame.setVisible(true);
	}

}
