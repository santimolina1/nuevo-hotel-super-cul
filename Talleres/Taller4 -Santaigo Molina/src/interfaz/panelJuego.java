package interfaz;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class panelJuego extends JPanel implements ActionListener 
{
	public final static String X = "x";
	
	private JButton btn;
    
	public panelJuego(PantallaFrame pantallaFrame) {
		int n=5;
		setLayout(new GridLayout(n,n));
		
		for (int i=0; i<n;i++) {
			for (int j=0; j<n;j++) {
				btn=new JButton();
				btn.setActionCommand(X);
				btn.addActionListener(this);
				btn.setBackground(Color.gray);
				add(btn);
			}
			
		}
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
