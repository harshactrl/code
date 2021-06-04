package com.examples.oops;

public class EncapsulationDemo {

	private int id;
	private String name;

	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public static void main(String args[]) {
		
		EncapsulationDemo d = new EncapsulationDemo();
		
		d.setId(1);
		d.setName("Srikanth");
		System.out.println("id : "+d.getId());
		System.out.println("Name : "+d.getName());
		System.out.println("class : "+ d.getClass());
	}

}
