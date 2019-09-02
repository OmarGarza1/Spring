package com.prueba.cdi;

import javax.inject.Inject;
import javax.inject.Named;



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

}
