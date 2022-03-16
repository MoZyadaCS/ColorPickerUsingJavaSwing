import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.*;
public class ColorPicker {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    jf.setSize(600, 210);
	    jf.setLocationRelativeTo(null);
	    jf.setResizable(false);
	    jf.setLayout(null);
	    jf.setVisible(true);
		JPanel selectedColorSquare = new JPanel();
		JLabel selectedColorText = new JLabel("Color: 127, 127, 127",JLabel.CENTER);
		JScrollBar redBar = new JScrollBar(JScrollBar.HORIZONTAL,127,1,0,256);
		JScrollBar greenBar = new JScrollBar(JScrollBar.HORIZONTAL,127,1,0,256);
		JScrollBar blueBar = new JScrollBar(JScrollBar.HORIZONTAL,127,1,0,256);
		JLabel redLabel = new JLabel("RED: ");
		JLabel greenLabel = new JLabel("Green: ");
		JLabel blueLabel = new JLabel("Blue: ");
		redLabel.setBounds(40, 40, 40, 25);
		greenLabel.setBounds(40,80,40,25);
		blueLabel.setBounds(40,120,40,25);
		redBar.setBounds(100,40,300,25);
		greenBar.setBounds(100,80,300,25);
		blueBar.setBounds(100,120,300,25);
		selectedColorText.setBounds(420, 125, 145, 25);
		selectedColorSquare.setBounds(420, 40, 145, 80);
		redBar.setBackground(Color.red);
		greenBar.setBackground(Color.green);
		blueBar.setBackground(Color.blue);
		selectedColorSquare.setBackground(new Color(127,127,127));
		jf.add(redLabel);
		jf.add(greenLabel);
		jf.add(blueLabel);
		jf.add(redBar);
		jf.add(greenBar);
		jf.add(blueBar);
		jf.add(selectedColorText);
		jf.add(selectedColorSquare);
		
		AdjustmentListener al = new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				Color newColor = new Color(redBar.getValue(),greenBar.getValue(),blueBar.getValue());
				selectedColorSquare.setBackground(newColor);
				selectedColorText.setText("Color: " + redBar.getValue() +", " + greenBar.getValue() + ", " + blueBar.getValue());
				
			}
		};
		redBar.addAdjustmentListener(al);
		greenBar.addAdjustmentListener(al);
		blueBar.addAdjustmentListener(al);
		
	}

}
