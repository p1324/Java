package com.earlybird.oops;

public class MultiIMPL {

	public static void main(String[] args) {
		MultiLevelChild c = new MultiLevelChild();
		c.bike();
		c.home();
		c.land();
		
		MultiLevelParent p= new MultiLevelChild();
		p.home();
		//upcasting
		//in inheritance it will call reference(p- parents method) method
		//in overriding it will call objects(new Multichild -childs method) method
	}

}
