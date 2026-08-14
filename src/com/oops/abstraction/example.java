package com.oops.abstraction;

public interface example {

	    void m();
	    void m1();
	    void m3();
	}

	abstract class A implements example {

	    public void m() {
	        System.out.println("m()");
	    }
	}

	class B extends A {

	    public void m1() {
	        System.out.println("m1()");
	    }

	    public void m3() {
	        System.out.println("m3()");
	    }
	}


