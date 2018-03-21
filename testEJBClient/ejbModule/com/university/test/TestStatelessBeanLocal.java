package com.university.test;


import javax.ejb.Remote;

@Remote
public interface TestStatelessBeanLocal {
	public void sayHello(String str);
}
