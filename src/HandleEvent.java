import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HandleEvent extends JFrame implements ActionListener{
	
	JTextField messageText;
	JButton clearButton,closeButton;
	JLabel messageLabel;
	
	public HandleEvent(){
		Container container = this.getContentPane();
		container.setLayout(new GridLayout(2, 1));
		JPanel upperPanel = new JPanel(new FlowLayout());
		JPanel lowerPanel = new JPanel(new FlowLayout());
		
		messageText = new JTextField(10);
		messageLabel = new JLabel("Message:");
		upperPanel.add(messageLabel);
		upperPanel.add(messageText);
		container.add(upperPanel);
		
		clearButton = new JButton("Clear");
		closeButton = new JButton("Close");
		lowerPanel.add(clearButton);
		lowerPanel.add(closeButton);
		container.add(lowerPanel);
		
		clearButton.addActionListener(this);
		closeButton.addActionListener(this);
		
		this.setSize(300,140);
		this.setTitle("Handle Event Sample");
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		new HandleEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==clearButton) {
			messageText.setText("");
		}
		
		if (e.getSource()==closeButton) {
			System.exit(0);
		}
		
	}
}
