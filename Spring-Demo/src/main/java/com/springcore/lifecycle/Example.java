package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String name;
	

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Example(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Example [name=" + name + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("method starting....");
	}
	@PreDestroy
	public void end()
	{
		System.out.println("method ending....");
	}
	

}
