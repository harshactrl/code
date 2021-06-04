package com.examples.polymorphysim;

public class TeamLead extends Manager {

	public void software() {//overridden method
		System.out.println("Team Lead: software available");
		
	}

	public void projectStructure() {
		System.out.println("Team Lead: Project Structure available");
	}
	public void documentation() {
		System.out.println("Tead Lead: project documentation available");
	}
}
