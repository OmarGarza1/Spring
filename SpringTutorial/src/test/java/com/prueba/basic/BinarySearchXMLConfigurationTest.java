package com.prueba.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.prueba.SpringTutorialApplicationBasic;

@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = SpringTutorialApplicationBasic.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class BinarySearchXMLConfigurationTest {

	@Autowired
	BinarySearchImpl binarySearch;

	@Test
	public void testBasicScenario() {
		int actualResult = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, actualResult);

	}

}
