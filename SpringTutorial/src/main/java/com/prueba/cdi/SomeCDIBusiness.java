package com.prueba.cdi;

import javax.inject.Inject;
import javax.inject.Named;
import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Value;

@Named
public class SomeCDIBusiness {
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}

	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.getData();

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}
