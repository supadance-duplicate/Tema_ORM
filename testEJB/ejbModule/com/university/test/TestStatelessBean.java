package com.university.test;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class TestStatelessBean
 */
@Stateless
public class TestStatelessBean implements TestStatelessBeanLocal {

    /**
     * Default constructor. 
     */
    public TestStatelessBean() {
        // TODO Auto-generated constructor stub
    }
    
    public void sayHello(String str)
    {
    	System.out.println(str);
    }

}
