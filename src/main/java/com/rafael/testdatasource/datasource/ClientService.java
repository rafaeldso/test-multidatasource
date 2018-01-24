package com.rafael.testdatasource.datasource;

public class ClientService {

	//private ClientDao clientDao;

	// standard constructors

	public String getClientName(ClientDatabase clientDb) {
		ClientDatabaseContextHolder.set(clientDb);
		//String clientName = this.clientDao.getClientName();
		//ClientDatabaseContextHolder.clear();
		return "clientName";
	}
}