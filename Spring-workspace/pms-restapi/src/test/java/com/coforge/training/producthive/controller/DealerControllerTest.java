package com.coforge.training.producthive.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.*;
import com.coforge.training.producthive.controller.DealerController;
import com.coforge.training.producthive.exception.ResourceNotFoundException;
import com.coforge.training.producthive.model.Address;
import com.coforge.training.producthive.model.Dealer;
import com.coforge.training.producthive.model.DealerAndAddressProjection;
import com.coforge.training.producthive.service.DealerService;

/**
 *Author		:Harsh.Vashishtha
 *Date		:Oct 4, 2025
 *Time		:3:04:18 AM
 *Project	:pms-restapi
 */
@SpringBootTest
class DealerControllerTest {

	Dealer dealer;

	@MockBean
	private DealerService dservice;

	@Autowired
	private DealerController dealerController;

	@BeforeEach
	void setUp() throws Exception {
		dealer=new Dealer();
	}

	@AfterEach
	void tearDown() throws Exception {
		dealer=null;
	}

	@Test
	void testCreateDealer() throws ParseException {
		dealer.setEmail("jhon@gmail.com");
		dealer.setFname("Jhon");
		dealer.setLname("Mike");
		dealer.setPassword("password123");

		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Date dob=new Date(df.parse("1990-01-01").getTime()); // use java.sql.date
		dealer.setDob(dob);

		dealer.setPhoneNo("1234567891");

		Address address=new Address();
		address.setStreet("123 Main Street");
		address.setCity("Bengaluru");
		address.setPincode(560001);

		dealer.setAddress(address);

		/*
		 * Matchers are like regex or wildcards where instead of a specific input (and or output), 
		 * you specify a range/type of input/output based on which stubs/spies can be rest and calls to stubs can be verified.
		 * Matchers are a powerful tool, which enables a shorthand way of setting up stubs as well as verifying invocations on 
		 * the stubs by mentioning argument inputs as generic types to specific values depending on the use-case or scenario.
		 * 
		 * any(java language class) –

		Example: any(ClassUnderTest.class) – This is a more specific variant of any() 
		and will accept only objects of the class type that’s mentioned as the template parameter.
		 * */

		when(dservice.registerDealer(any(Dealer.class))).thenReturn(dealer);

		ResponseEntity<String> re=dealerController.createDealer(dealer);

		assertEquals(HttpStatus.OK, re.getStatusCode());
		assertEquals("Registration Successfull",re.getBody());

		verify(dservice,times(1)).registerDealer(any(Dealer.class));



	}

	@Test
	void testLoginDealer() throws ResourceNotFoundException {
		dealer.setEmail("jhon@gmail.com");
		dealer.setPassword("password123");

		/*when() Then() method
		It enables stubbing methods. It should be used when we want to mock to return specific values when 
		particular methods are called. In simple terms, "When the XYZ() method is called, 
		then return ABC." It is mostly used when there is some condition to execute.
		 * 
		 * */
		when(dservice.loginDealer("jhon@gmail.com")).thenReturn(Optional.of(dealer));

		Dealer x= dservice.loginDealer("jhon@gmail.com").get();
		assertEquals(x.getEmail(), dealer.getEmail());
		assertEquals(x.getPassword(), dealer.getPassword());

		// assertion for Login fail
		//assertEquals(x.getPassword(), "password");

		ResponseEntity<Boolean> result=dealerController.loginDealer(dealer);
		assertTrue(result.getBody());

		/*
		 * The verify() method is used to check whether some specified methods are called or not. 
		 * In simple terms, it validates the certain behavior that happened once in a test. 
		 * It is used at the bottom of the testing code to assure that the defined methods are called.
		 * */
		verify(dservice,times(2)).loginDealer("jhon@gmail.com");
	}

	@Test
	void testGetDealerInfo() {
		List<DealerAndAddressProjection> mockDealerInfo =new ArrayList<>();

		DealerAndAddressProjection dealerInfo1= new DealerAndAddressProjection();
		dealerInfo1.setEmail("jhon@gmail.com");
		dealerInfo1.setFname("Jhon");
		dealerInfo1.setLname("Mike");
		dealerInfo1.setPhoneNo("9856789543");
		dealerInfo1.setStreet("123 Main Street");
		dealerInfo1.setCity("Bengaluru");
		dealerInfo1.setPincode(560001);

		DealerAndAddressProjection dealerInfo2= new DealerAndAddressProjection();
		dealerInfo2.setEmail("jane@gmail.com");
		dealerInfo2.setFname("Jane");
		dealerInfo2.setLname("Smith");
		dealerInfo2.setPhoneNo("6656789536");
		dealerInfo2.setStreet("456 Park Street");
		dealerInfo2.setCity("Kolkatta");
		dealerInfo2.setPincode(330001);

		mockDealerInfo.add(dealerInfo1);
		mockDealerInfo.add(dealerInfo2);

		when(dservice.getDealerInfo()).thenReturn(mockDealerInfo);

		ResponseEntity<List<DealerAndAddressProjection>> re=dealerController.getDealerInfo();

		assertEquals(HttpStatus.OK, re.getStatusCode());
		assertEquals(mockDealerInfo, re.getBody());

		verify(dservice,times(1)).getDealerInfo();
	}

}