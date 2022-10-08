package com.q2;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<String> {

	@Override
	public boolean test(String t) {
		if(t=="Rakib" )return true;
		else
			return false;
	}

}
