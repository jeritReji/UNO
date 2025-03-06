package com.games.app.UNO;

public class Card {
	private Colors color;
	private Values value;
	public Card(Colors color,Values value) {
		this.color = color;
		this.value = value;
	}
	
	public Colors getColor() {
		return color;
	}	
	public Values getValue() {
		return value;
	}
}