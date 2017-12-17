package com.webapps.training.business;

import com.webapps.training.beans.DataUser;

public class DataUserImpl implements DataUserInterface{

	DataUserDAOInterface dUserInterface;
	
	
	
	
	public DataUserDAOInterface getdUserInterface() {
		return dUserInterface;
	}

	public void setdUserInterface(DataUserDAOInterface dUserInterface) {
		this.dUserInterface = dUserInterface;
	}

	public int save(DataUser user) {
		return dUserInterface.save(user);
	}

	public DataUser find(String login) {
		return dUserInterface.find(login);
	}

}
