package com.springcore.collections;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id ;
	private String name ;
	private List<String> answers ;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String name, List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void display() {
		System.out.println(id + " " + name);
		System.out.println("answers are ");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
			
		}
		
	}
	

}
