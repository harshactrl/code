package com.examples.java8;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;


public class MainClass implements Robot {


	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Yes!Am walking..."+name);
		
		
	}

	@Override
	public void standup() {
		// TODO Auto-generated method stub
		System.out.println("Yes!Am standing..."+name);
		
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("Yes!Am going..."+name);
		
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Yes!Am reading..."+name);
		
	}

	@Override
	public void talk() throws InterruptedException {
		//Split the word using split().
		String word = companyName;
		String[] alphabets = word. split("");
		for(String alphabet : alphabets)
		{
		System. out. print(alphabet);
		TimeUnit.SECONDS.sleep(1);
			
		}
		int n=5;
		 ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
		 for (int i=1; i<=n; i++) {
	            arrli.add(i); 
		 }
		 
		for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" ");
		arrli.remove(arrli);
    } 
	
	public static void main(String[] args) throws InterruptedException {
		MainClass mainClass=new  MainClass();
		mainClass.go();
		TimeUnit.SECONDS.sleep(1);//Time delay execution
		mainClass.walk();
		TimeUnit.SECONDS.sleep(1);
		mainClass.read();
		TimeUnit.SECONDS.sleep(1);
		mainClass.standup();
		TimeUnit.SECONDS.sleep(1);
		mainClass.talk();
	}
}

