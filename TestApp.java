package com.main.test;

import java.util.ArrayList;

public class TestApp {
        public static void main(String[] args) {
			
			int a =100;
			int b = 200;
			int z = 300;
			int c = 400;
			int k = 2332;
			b = a++ + b++;
			
			if(b %2 == 0) {
				System.out.println(a++ +"  " + --b);
			}else {
				System.out.println(--a);
			}
		}
}
