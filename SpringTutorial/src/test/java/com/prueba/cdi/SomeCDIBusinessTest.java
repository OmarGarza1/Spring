package com.prueba.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.prueba.SpringTutorialApplicationBasic;

//@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = SpringTutorialApplicationBasic.class)

//with Mockito
@RunWith(MockitoJUnitRunner.class)
public class SomeCDIBusinessTest {

	/*
	 * without mockito
	 * 
	 * @Autowired SomeCDIBusiness business;
	 */
	@InjectMocks
	SomeCDIBusiness business;
	@Mock
	SomeCdiDao daoMock;

	@Test
	public void testBasicScenario1() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
		assertEquals(4, business.findGreatest());
	}

	@Test
	public void testBasicScenario2() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, business.findGreatest());
	}

	@Test
	public void testBasicScenario3() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 2 });
		assertEquals(2, business.findGreatest());
	}

}
