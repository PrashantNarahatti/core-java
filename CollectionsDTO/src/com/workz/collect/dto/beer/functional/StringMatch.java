package com.workz.collect.dto.beer.functional;

@FunctionalInterface
public interface StringMatch {
	public  boolean evaluate(String element,String value);


}