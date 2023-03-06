package ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		final ArrayList<Month> monthList = new ArrayList<Month>();
		monthList.add(new Month("January"));
		monthList.add(new Month("February"));
		monthList.add(new Month("March"));
		monthList.add(new Month("April"));
		monthList.add(new Month("May"));
		monthList.add(new Month("June"));
		monthList.add(new Month("July"));
		monthList.add(new Month("September"));
		monthList.add(new Month("October"));
		monthList.add(new Month("November"));
		monthList.add(new Month("December"));
		
		for(Month month:monthList) {System.out.println(month.getMonthName());}
		
		Month august = new Month("August");
		monthList.add(7,august);
		
		System.out.println("printing august on 8th line");
		for(Month month:monthList) {System.out.println(month.getMonthName());}
		
		System.out.println("Control dupes");
		HashSet<Month> monthSet = new HashSet(monthList);
		monthSet.add(august);
		for(Month month:monthSet) {System.out.println(month.getMonthName());}
		System.out.println(monthList.size());
		System.out.println(monthSet.size());
		
		for(Month month:monthList) {System.out.println(month.getMonthName());}
		
		Iterator<Month> it = monthSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getMonthName());
		}
		
	}

}
