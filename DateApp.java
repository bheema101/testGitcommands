package com.main.test;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.ArrayList;

public class DateApp {
        public static void main(String[] args) {
			
			LocalDate date = LocalDate.of(2014,03, 17);
			date = date.with(ChronoField.MONTH_OF_YEAR,9);
			date = date.plusYears(3).minusDays(18);
			date.withYear(2011);
			System.out.println(date);
		/*	if(b %2 == 0) {
				System.out.println(a++ +"  " + --b);
			}else {
				System.out.println(--a);
			}
		}*/
}
}
