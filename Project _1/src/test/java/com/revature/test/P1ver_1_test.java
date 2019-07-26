package com.revature.test;

import static org.junit.Assert.assertEquals;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import com.revature.beans.Users;
import com.revature.daoImpl.UserDaoImpl;

public class P1ver_1_test {
	static UserDaoImpl udao = null;
	public static Users user = new Users(1004, "Jim", "Wong", "pass", 1);
	Logger log = Logger.getLogger(P1ver_1_test.class);
	

	@Before()
	public void setUpBeforeTest() throws Exception {
		udao = new UserDaoImpl();
	}

	@Test()
	public void setUpTest() throws Exception {
		int userId = 1004;

		assertEquals("I expect this to fuck up", user, udao.getUserInfo(userId));
	}

}
