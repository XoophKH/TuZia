package malek;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Applicazione {
	private JFrame mainFrame;
	private JPanel p = new javax.swing.JPanel();
	private JTextField anagrama = new javax.swing.JTextField();
	private JTextArea list = new javax.swing.JTextArea(17, 20);
	private JTextArea anagrams = new javax.swing.JTextArea(17, 20);
	private int i;

	public Applicazione() {
		prepareGUI();
	}

	private void prepareGUI() {
		mainFrame = new javax.swing.JFrame("Esame");

		p.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Anagram"));
		anagrama.setColumns(20);
		p.add(anagrama);
		mainFrame.add(p);
			
		
		

		p = new JPanel();
		p.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "List"));
		list.setBorder(BorderFactory.createLineBorder(Color.black));
		p.add(list);
		mainFrame.add(p);

		list.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
					case KeyEvent.VK_SPACE: {
	
						String areaText = anagrams.getText();
	
						if (areaText.length() < 2) 
							anagrams.setText("");
						else 
							anagrams.replaceRange("", areaText.length() - 1, areaText.length());

						break;
					}
	
					case KeyEvent.VK_ENTER: {
						anagrama.setEditable(false);
						String anagramma = anagrama.getText().toLowerCase();
						String parola = list.getText().toLowerCase();
						String[] split = parola.split("\n");
						if (anagramma.length() == split[i].length()) {
	
							String _1 = sortString(anagramma);
							String _2 = sortString(split[i]);
	
					
							if (_1.equals(_2)) {
								anagrams.append(split[i] + "\n");
							}
						}
						i++;
	
						break;
					}
				}
			}
		});
		
		p = new JPanel();
		p.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Anagrams"));
		anagrams.setBorder(BorderFactory.createLineBorder(Color.black));
		anagrams.setEditable(false);
		p.add(anagrams);
		mainFrame.add(p);

		mainFrame.setSize(800, 350);
		mainFrame.setLayout(new GridLayout(1, 3));
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - mainFrame.getWidth()) / 2);
		int y = (int) ((dimension.getHeight() - mainFrame.getHeight()) / 2);
		mainFrame.setLocation(x, y);
		mainFrame.setVisible(true);
	}

	public static String sortString(String stringa) {
		char tempArray[] = stringa.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}




	public static void main(String[] args) {
		new Applicazione();
	}
}