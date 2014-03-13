import javax.swing.*;
import java.awt.*;

public class BackgroundImage extends JFrame {
	JScrollPane scrollPane; 
	ImageIcon icon; 
	Image image; 

	public BackgroundImage() { 
		icon = new ImageIcon("back.png"); 

		JPanel panel = new JPanel() { 
			protected void paintComponent(Graphics g) { 
				// Dispaly image at at full size 
				g.drawImage(icon.getImage(), 0, 0, null); 

				super.paintComponent(g); 
			} 
		}; 
		panel.setOpaque(false); 
		panel.setPreferredSize(new Dimension(400, 400)); 
		scrollPane = new JScrollPane(panel); 
		getContentPane().add(scrollPane); 

		JButton button = new JButton( "Click me!" ); 
		panel.add( button ); 
	} 
}
