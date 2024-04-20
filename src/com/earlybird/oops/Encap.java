package com.earlybird.oops;

public class Encap {
	private int id;

	public int getId()
	{
		return id;
	}
	
	public void setId(int id1)
	{
		id=id1;
	}

	public void display() {
		System.out.println("id is " + id);
	}
}
