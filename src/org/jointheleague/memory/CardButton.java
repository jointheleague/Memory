package org.jointheleague.memory;

import javax.swing.Icon;
import javax.swing.JButton;
import org.jointheleague.cards.Card;

/**
 * A CardButton is a JButton that is associated with a Card. A CardButton can be
 * in one of two states; face up or face down. In the face up state it displays
 * the face of the associated Card, and in the face down state it displays the
 * back of the associated Card.
 * 
 * @see javax.swing.JButton
 */
@SuppressWarnings("serial")
public class CardButton extends JButton {

	private boolean faceUp = false;
	private Card card;
	private Icon faceIcon;
	private Icon backIcon;

	/**
	 * Constructor
	 * 
	 * @param card
	 *            the Card of this CardButton
	 * @throws IllegalArgumentException
	 *             if card is null
	 */
	CardButton(Card card) throws IllegalArgumentException {
		super();
		//Your code here
	}

	public boolean isFaceUp() {
		// TODO Auto-generated method stub
		return false;
	}

	public void flip() {
		// TODO Auto-generated method stub
		
	}

	public Card getCard() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCard(Object object) {
		// TODO Auto-generated method stub
		
	}

}