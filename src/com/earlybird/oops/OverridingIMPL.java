package com.earlybird.oops;

public class OverridingIMPL {

	public static void main(String[] args) {
		OverridingChild c = new OverridingChild();
		c.home();
		
		OverridingParent p = new OverridingParent();
		p.home();

		OverridingParent p1 = new OverridingChild();
		p1.home();
		

	}

}
