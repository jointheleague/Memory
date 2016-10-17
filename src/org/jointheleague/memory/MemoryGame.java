package org.jointheleague.memory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.jointheleague.cards.Card;
import org.jointheleague.cards.Deck;

@SuppressWarnings("serial")
public class MemoryGame extends JPanel implements Runnable, ActionListener {

	/**
	 * Constants
	 */
	private static final int NUM_ROWS = 4;
	private static final int NUM_COLUMNS = 6;
	private static final int NUM_CARDS = NUM_ROWS * NUM_COLUMNS;
	
	/**
	 * Starts the game.
	 * 
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new MemoryGame());
	}

	/**
	 * Initializes the MemoryGame. Generates a list of CardButtons and places
	 * them on a grid inside a JFrame.
	 */
	@Override
	public void run() {
		// Your code here
	}

	/**
	 * Produces an array containing a random selection of cards where each card
	 * occurs exactly two times in the array. Cards occur in random order.
	 * <p>
	 * @param deck
	 *            A Deck instance
	 * @param numCards
	 *            the number of cards to select 
	 *            (number of pairs = numCards /	2). Must be even.
	 * @return the Card array
	 */
	public static Card[] selectCards(Deck deck, int numCards) {
		// Your code here
		return null;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Your code here
	}

}