import javax.swing.*;
import java.awt.*;

public class Frame {
	public static void main(String[] args) {
		BackgroundImage frame = new BackgroundImage(); 
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
		frame.setSize(300, 300); 
		frame.setLocationRelativeTo(null); 
		frame.setVisible(true); 
		/*JFrame frame = new JFrame("Test Frame");
		JButton button = new JButton("Click me!");
		JTextField textField = new JTextField("prova text-field");
		frame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		ImageIcon img = new ImageIcon("back.png");
		img.getImage();

		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		frame.add(textField, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		frame.add(button, gbc);

		frame.setSize(300, 250);
		frame.setLocation(200,200);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);*/
	}
}
