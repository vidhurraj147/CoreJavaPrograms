package com.winterbe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultKeywordInterfaceImpl {

	public static void main(String[] args) {
		Formula formula = new Formula() {
			
			@Override
			public double calculate(double b) {
				return squareRoot(b*10);// 2*b;
			}
		};
		System.out.println(formula.calculate(1000));
		System.out.println(formula.squareRoot(100));
		
		List<String> list = Arrays.asList("Danial","Dora","Rahul","Podisha","Avaina","Kadgekar","","other","Something");
		System.out.println(list);
		
		Collections.sort(list,(o1,o2) -> o1.compareTo(o2));
		
		//OLD JAVA WAY
//		Collections.sort(list, new Comparator<String>(){
//			@Override
//			public int compare(String o1, String o2){
//				return o1.compareTo(o2);
//			}
//			
//		});
		System.out.println(list);
	}
	

}
