package com.sopra.pox3.garbage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GarbageApplication {

	public static void main(String[] args) throws InterruptedException {

		List<Bag> list= new GarbageApplication().init();

		System.gc();
		Thread.sleep(30_000);
		
		System.out.println(list);
	}

	public List<Bag> init() throws InterruptedException {
		Random random = new Random();
		List<Bag> allBags = new ArrayList<>();
		new Bag(-1);
		
		for (int i = 0; i < 1_000; i++) {
			Thread.sleep(3);
			allBags.add(new Bag(i));
		}
		return allBags;
	}
}
