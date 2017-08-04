package com.sopra.pox3.inheritance;

import java.util.Arrays;
import java.util.List;

public class CovariantApplication {
	
	public static void main(String[] args){
		
		Halobacterium b1 = new Halobacterium();
		Halobacterium b2 = new Halobacterium();
		Halobacterium b3 = new Halobacterium();
		Halobacterium[] bactos = {b1, b2, b3};
		
		Cat cat = new Cat();
		//bactos[0] = cat;
		
		LivingStuff[] stuffs = {cat, b1, b2};
		
		System.out.println(Arrays.toString(bactos));
		System.out.println(Arrays.toString(stuffs));
		
		//So far, so good...
		
		stuffs = bactos; //covariance
		stuffs[0] = cat;
		
		System.out.println(Arrays.toString(stuffs));
		
	}

}

class Cat implements LivingStuff{

	@Override
	public List<LivingStuff> multiply() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}