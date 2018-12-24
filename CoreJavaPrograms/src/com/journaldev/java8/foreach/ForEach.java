package com.journaldev.java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<21;i++) list.add(i);
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		list.forEach(t -> new MyConsumer().accept(t));
		System.out.println("====================================================");
		MyConsumer myConsumer = new MyConsumer();
		list.forEach(myConsumer);
		System.out.println("====================================================");
		list.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.println("Anonymous Consumer "+t);
				
			}
		});
	}

}
