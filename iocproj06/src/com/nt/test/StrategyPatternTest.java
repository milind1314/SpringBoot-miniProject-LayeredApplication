package com.nt.test;

import com.nt.factory.FlipkartFactory;
import com.nt.comp.*;

public class StrategyPatternTest {

	public static void main(String[] args) {
		
		try {
			FlipKart fkt = FlipkartFactory.getInstance("DTDC");
			
			String result = fkt.shopping(new String[] {"Shirt","Trouser","Jeans","Tshirt"}, new double[] {800.0,1700.0,1350.0,650.0});
			
			System.out.println(result);
			
			fkt = FlipkartFactory.getInstance("bluedart");
			
			result = fkt.shopping(new String[] {"Book","Pen","Pencil","Erasure"}, new double[] {70.0,10.0,7.0,5.0});
			
			System.out.println(result);
			
		} catch (Exception e) {
			
			System.out.println(e);
		}
	}
	
}
