package Harjoitukset;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class muunnin extends JFrame {

	JButton nappi;
	JLabel celsius, tulos;
	static JTextField luvut;

	public muunnin() {
		setLayout(new GridLayout(2, 2));
		celsius = new JLabel("Celsius");
		add(celsius);

		luvut = new JTextField();
		add(luvut);

		nappi = new JButton("Convert");
		add(nappi);

		tulos = new JLabel();
		add(tulos);

		nappi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String numerot = luvut.getText();
				float desimaali=Float.parseFloat(numerot);
				double nytLoppu=desimaali*1.8+32;
				tulos.setText("Fahrenheit: "+nytLoppu);
				}catch(Exception i) {
					tulos.setText("Invalid input, try again.");
				}
			}
		});
	}

	public static void main(String args[]) {

		muunnin ikkuna = new muunnin();
		ikkuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ikkuna.setVisible(true);
		ikkuna.pack();
		ikkuna.setTitle("Celsius Converter");
		ikkuna.setSize(300, 100);

	}
}
