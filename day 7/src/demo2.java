
public class demo2 {
	package com.ank.constructor;

	class cntr {
		  private String name;

		  cntr() {
		    System.out.println("Constructor Called:");
		    name = "Ankesh";
		  }

		  public static void main(String[] args) {

		    
		    cntr obj = new cntr();
		    System.out.println("The name is " + obj.name);
		  }
		}
}
