package com.ashokit.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.anyString;

import java.lang.reflect.Method;

import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.powermock.api.mockito.PowerMockito;

import com.ashokit.dao.UserDaoImpl;

public class UserServiceImplTest {

	@Test
	@Ignore
	public void testGetNameByUserId() {
		UserDaoImpl mockDao = PowerMockito.mock(UserDaoImpl.class);
		
		PowerMockito.when(mockDao.findNameById(101))
					.thenReturn("Nick");
		
		UserServiceImpl service = new UserServiceImpl(mockDao);
		String name = service.getNameByUserId(101);
		assertEquals("Nick", name);
	}
	
	@Test
	@Ignore
	public void testGetEmailByUserId() {
		UserDaoImpl mockDao = PowerMockito.mock(UserDaoImpl.class);
		
		PowerMockito.when(mockDao.findEmailById(101))
					.thenCallRealMethod();
		
		UserServiceImpl service = new UserServiceImpl(mockDao);
		
		String email = service.getEmailByUserId(101);
		
		assertEquals("john.k@gmail.com", email);
	}
	
	@Test
	@Ignore
	public void testDoProcess() {
		UserServiceImpl mockService = PowerMockito.mock(UserServiceImpl.class);
		try {
			PowerMockito.doNothing().when(mockService, "pushMsgToKafkaTopic", anyString());
			mockService.doProcess();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testM1() throws Exception {

		UserServiceImpl userServiceSpy = PowerMockito.spy(new UserServiceImpl());

		try {
			PowerMockito.when(userServiceSpy, "formatMsg", "test msg").thenReturn("TEST MSG FORMATTED");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String formattedMsg = userServiceSpy.m1();
		
	    assertNotNull(formattedMsg);
	}
}
