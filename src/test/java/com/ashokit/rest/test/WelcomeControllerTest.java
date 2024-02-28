package com.ashokit.rest.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ashokit.rest.WelcomeController;
import com.ashokit.service.WelcomeService;

@WebMvcTest(value=WelcomeController.class)
public class WelcomeControllerTest {
	
	@MockBean
	private WelcomeService welcomeService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void welcomeTest() throws Exception {
		
		when(welcomeService.getwelcomeMsg()).thenReturn("welcome to Ashokit ....!!");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		MvcResult mvcReturn = mockMvc.perform(requestBuilder).andReturn();
		MockHttpServletResponse response = mvcReturn.getResponse();
		int status = response.getStatus();
		assertEquals(200, status);
		
	}
	
	
	@Test
	  public void loginUser() throws Exception { 
		
		when(welcomeService.getLogin()).thenReturn("User Login Successfully");
		  
		  MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/login");
		  MvcResult mvcReturn = mockMvc.perform(mockHttpServletRequestBuilder).andReturn();
		  MockHttpServletResponse response = mvcReturn.getResponse();
		  int status = response.getStatus();
		  assertEquals(200, status);
	  }
	
	@Test
	public void email() throws Exception {
		
		
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("/email");
		MvcResult andReturn = mockMvc.perform(mockHttpServletRequestBuilder).andReturn();
		MockHttpServletResponse response = andReturn.getResponse();
		int email=response.getStatus();
		assertEquals(200, email);
	}
	 
	

}
