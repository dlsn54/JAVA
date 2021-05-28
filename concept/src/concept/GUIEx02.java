package concept;

import javax.swing.*;
import java.awt.*;
public class GUIEx02 extends JFrame{

	public GUIEx02(){
		setTitle("≈∏¿Ã∆≤");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contenPane =getContentPane();
		
		contenPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contenPane.add(new JButton("Add"));
		contenPane.add(new JButton("Sub"));
		contenPane.add(new JButton("Mul"));
		contenPane.add(new JButton("Div"));
		contenPane.add(new JButton("Calculate"));
		contenPane.add(new JButton("sgas"));
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUIEx02();

	}

}
