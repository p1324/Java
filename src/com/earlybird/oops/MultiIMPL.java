package com.earlybird.oops;

public class MultiIMPL {

	public static void main(String[] args) {
		MultiChild c = new MultiChild();
		c.bike();
		c.home();
		c.land();
		
		MultiParent p= new MultiChild();
		p.home();
		//upcasting
		//in inheritance it will call reference(p- parents method) method
		//in overriding it will call objects(new Multichild -childs method) method
	}

}
