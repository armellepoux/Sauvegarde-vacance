package com.sopra.pox3.equals;

public class Card {
	
	int value;
	char color;
	
	
	public Card(int value, char color) {
		this.value = value;
		this.color = color;
	}
	
	//Si on fait le equals et hascode separemment
	
	/*@Override
	public int hashCode() {
		return this.value+this.color;
	}
	
	@Override// les else ne sont pas obligatoires
	public boolean equals(Object obj) {
		
		if(obj instanceof Card){
			
			Card other= (Card) obj;
			if(other.value == this.value && other.color == this.color){
				return true;
			}
			
		}
		return false;
	}*/
	
	
	
	@Override
	public String toString() {
		//return ""+this.value+this.color;
		return String.valueOf(this.value) + this.color;
	}

	//Si on genere le equals et hashcode simultanement grace à Alt+Shift+S
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (color != other.color)
			return false;
		if (value != other.value)
			return false;
		return true;
	}

	
	
	
	
	
	
} 
