package com.journaldev.java8.foreach;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Class MyConsumer accept method "+t);
	}
}
