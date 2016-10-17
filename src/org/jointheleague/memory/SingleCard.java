package org.jointheleague.memory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jointheleague.cards.Card;
import org.jointheleague.cards.Deck;

/**
 * 
 * @author ecolban
 * 
 */
@SuppressWarnings("serial")
public class SingleCard implements Runnable, ActionListener {

	private CardButton button;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new SingleCard());
	}

	@Override
	public void run() {
		//Your code here
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Your code here
	}

}
