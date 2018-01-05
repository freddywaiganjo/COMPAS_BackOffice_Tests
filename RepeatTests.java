package com.example.tests;

import junit.framework.JUnit4TestAdapter;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.AllTests;


@RunWith(AllTests.class)
public final class RepeatTests {

  public static TestSuite suite(){
	TestSuite suite = new TestSuite();
	for (int i= 0; i<3; i++) {
	    suite.addTest(new JUnit4TestAdapter(NewUser.class));
    }
	
	return suite;
  }
}
