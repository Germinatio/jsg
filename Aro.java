import javax.swing.*;
import java.awt.*;

public class Aro {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Test Frame");
		JButton button = new JButton("Click me!");
		JTextField textField = new JTextField("prova text-field");
		frame.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
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
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}