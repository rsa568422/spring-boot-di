package com.bolsadeideas.springboot.di.app.models.services;

public class MiServicio implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante simple...";
	}

}
