package com.sopra.pox3.collection.primes;

import java.util.Iterator;

public class PrimeIterable implements Iterable<Integer>{

	@Override
	public Iterator<Integer> iterator() {
		return new PrimeIterator();
	}

}

class PrimeIterator implements Iterator<Integer>{
	
	int position = 1;

	@Override
	public boolean hasNext() {
		return position <= 100;
	}

	@Override
	public Integer next() {
		
		while(! isPrime(position)){	
		position++;
		}
		return position++;
	}
	
	boolean isPrime(int n) {
		if(n==4){
			return false;
		}
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
}
