package com.mahek.practiceone;

import org.junit.Test;
import static org.junit.Assert.*;

public class JunitTest {
	
	    @Test
	    public void testSimpleAdd() {
	        Student testStu = new Student();

	        int result = testStu.simpleAdd(5,10);
	        assertEquals(15, result);
	    }
	    
	    @Test
	    public void testGotoSleep() {
	        Student testStu = new Student();

	        boolean bol = testStu.gotoSleep(13);
	        assertEquals(false, bol);
	    }
}

