package com.prueba;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prueba.xml.XmlPersonDao;

public class SpringTutorialApplicationXMLContext {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringTutorialApplicationXMLContext.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

		XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);

		System.out.println(personDao);
		System.out.println(personDao.getXmlJdbcConnection());

		applicationContext.close();
	}

}
