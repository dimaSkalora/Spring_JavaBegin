package javabegin.training.spring.start;


import javabegin.training.spring.interfaces.Hand;
import javabegin.training.spring.interfaces.Head;
import javabegin.training.spring.interfaces.Leg;

public class Robot {
	
	private Hand hand;
	private Leg leg;
	private Head head;
	
	public Robot(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
