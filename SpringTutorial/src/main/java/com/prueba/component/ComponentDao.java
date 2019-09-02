package com.prueba.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDao {
	@Autowired
	ComponentJDBCConnection jdbcConnection;

	public ComponentJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}

}
