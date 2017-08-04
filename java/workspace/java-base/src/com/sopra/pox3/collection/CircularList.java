package com.sopra.pox3.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CircularList<E> extends ArrayList<E> implements Iterator<E>{
	int count=0;
	
	public E next() {
	
	if (this.size() == count) {
		this.count = 0;
	}
	E result = this.get(count);
	count++;
	return result;
	}
	
	@Override
	public Iterator<E> iterator() {
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return true;
	}
}
