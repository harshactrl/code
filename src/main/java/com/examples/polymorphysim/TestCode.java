package com.examples.polymorphysim;

public class TestCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****Manager****"); 
		Manager manager= new Manager();
		manager.chair();
		manager.laptop();
		manager.project();
		manager.software();
		manager.table();
		
		System.out.println("****Team Lead****"); 
		TeamLead teamLead=new TeamLead();
		teamLead.chair();
		teamLead.laptop();
		teamLead.project();
		teamLead.software();
		teamLead.table();
		teamLead.documentation();
		teamLead.projectStructure();
		
		
		
		
		System.out.println("****JuniorDeveloper****"); 
		JuniorDeveloper jr=new JuniorDeveloper();
		
		jr.chair();
		jr.code();
		jr.documentation();
		jr.projectStructure();
		jr.software();
		jr.laptop();
		jr.table();
		jr.project();
		
		System.out.println("****Top casting with teamlead and jr.developer****"); 
		TeamLead teamLead1= new JuniorDeveloper();
		teamLead1.chair();
		//teamLead1.code(); here teamlead not accessed to junior developer code its not a overridden method
		teamLead1.documentation();
		teamLead1.projectStructure();
		teamLead1.software();
		teamLead1.laptop();
		teamLead1.table();
		teamLead1.project();
		
	
		
		
		System.out.println("****Top casting with manager and jr.developer****"); 
		Manager manager1= new JuniorDeveloper();
		
		manager1.chair();
//		manager1.code();
//		manager1.documentation();
//		manager1.projectStructure();
		manager1.software();
		manager1.laptop();
		manager1.table();
		manager1.project();
		
		
		System.out.println("****Top Casting with manager with team lead****"); 
		Manager manager2= new TeamLead();
		manager2.chair();
		manager2.laptop();
		manager2.project();
		manager2.software();
		manager2.table();
//		manager2.documentation();
//		manager2.projectStructure();
		
		
		
	//JuniorDeveloper jr1= (JuniorDeveloper) new Manager();
	//	jr1.code();//here we won't get any compilation error but run time error will get..parent class not compatible with child class reference variable mean small things fit for big one but big thing doesn't fit in small one 
		
	}

}
