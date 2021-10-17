package org.Test;

public class AXISBank implements AbstractTest {

	@Override
	public void savings() {
		System.out.println("savin");
		
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		
		System.out.println("savin");
	}

	@Override
	public void branch() {
		// TODO Auto-generated method stub
		System.out.println("branch");
		
	}

	@Override
	public void name1() {
		// TODO Auto-generated method stub
		System.out.println("name1");
		
	}
	
	private void name() {
		// TODO Auto-generated method stub
		System.out.println("name");

	}
	public static void main(String[] args) {
		AXISBank a = new AXISBank();
		a.branch();
		a.fixed();
		a.savings();
		a.name();
		a.name1();
		
		
	}
	
	
}
