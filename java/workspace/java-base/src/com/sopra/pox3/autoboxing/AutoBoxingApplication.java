package com.sopra.pox3.autoboxing;

import java.util.Arrays;
import java.util.List;

public class AutoBoxingApplication {

	public static void main(String[] args) {

		new AutoBoxingApplication().init();
		new AutoBoxingApplication().compare();
		new AutoBoxingApplication().itsATrap();
		List<Boolean> list = new AutoBoxingApplication().getTruths();
		System.out.println(list);
		System.out.println(list.get(1).compareTo(false));
	}

	public void init() {

		int x = 2; // primitive
		Integer y = 2; // wrapper
		Integer z = new Integer(2);

		System.out.println(x == y);
		System.out.println(x == z);

		z = new Integer(x); //no autoboxing a la dure. On est oblige de le faire manuellement
		z = x; //autoboxing : the compiler works for us

	}
	
	void compare(){
		
		Integer a = new Integer(12);
		Integer b = new Integer(12);
		
		System.out.println(a == b);
		System.out.println("Equals ? "+a.equals(b));
		
	}
	
	void itsATrap(){
		
		Integer a = 13;
		Integer b = 13;
		
		System.out.println(a == b);
		System.out.println(a.compareTo(b)); // renvoit 0 quand c'est egal -1 plus petit et +1 plus grand
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y); // faux car Integer reserve une case de -128 a +127
		System.out.println(x = y); // Du coup il ne faut pas utiliser == mais =
	}
	
	//wrapper can specify a list
	//permet de mettre des booléens dans une liste
	List<Boolean> getTruths(){
		
		return Arrays.asList(true, false, false, true, false, true);
	}
}
