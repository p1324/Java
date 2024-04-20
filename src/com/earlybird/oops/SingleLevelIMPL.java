package com.earlybird.oops;

public class SingleLevelIMPL {

	public static void main(String[] args) {
		
		SingleLevelChild c= new SingleLevelChild();
		c.bike();
		c.home();
		SingleLevelParent p=  new SingleLevelChild();
	      p.home();
	    //  SingleLevelChild c1= new SingleLevelParent();
	     SingleLevelParent p1=new SingleLevelChild();
	      
	}

}
