import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FenetreGUI extends JFrame implements ActionListener{

	JButton closeB = new JButton("Fermer");
	ActionListener AL;
	Container contentW = this.getContentPane();
	Box content = Box.createVerticalBox();
	Box contentArg = Box.createVerticalBox();
	Box contentRes = Box.createVerticalBox();
	Box contentError = Box.createHorizontalBox();
	
	FenetreGUI(String name){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setName(name);

		this.setSize(200, 200);
		this.setVisible(true);
		closeB.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.equals("Fermer")){
			this.dispose();
			System.exit(0);
		}
		
	}

}
