package com.winterbe;

public class ConverterFunctionalInterfaceImpl {

	public static void main(String[] args) {
		Converter<String, Integer> convt = (from) -> Integer.valueOf(from);
		Converter<String, Integer> convtOtherWay = Integer::valueOf;
		Integer converted = convt.convert("123456");
		System.out.println(converted);
		
		Something something = new Something();
		Converter<String, String> convtString = something::startsWith;
		String convertedString = convtString.convert("Java");
		System.out.println(convertedString);

	}

}
