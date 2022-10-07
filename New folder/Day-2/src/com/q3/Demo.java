package com.q3;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		PrintList p=city -> System.out.println(city);
		
      List<String> list=Arrays.asList("Kolkata","Delhi","Mumbai","Chennai","Bangalore");
      
      Comparator<String> descPriceComp = (String b1, String b2) -> (int) b2.compareTo(b1);

      Collections.sort(list,descPriceComp);
      
		p.display(list);
	}

}
