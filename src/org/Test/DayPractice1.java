package org.Test;

import org.tets1.Company1;

//Child extends Parent 2
public class DayPractice1 extends Company1 {
	
	private void Emplo1() {
		
		System.out.println("Employee name is Rohini");

	}
	private void Empoy2() {
		System.out.println("Employee 2 name is Sakthi");

	}
	public static void main(String[] args) {
		DayPractice1 d= new DayPractice1();
		d.Emplo1();
		d.Empoy2();
	d.clientname();
	d.companyname();
	
	}
	

}
