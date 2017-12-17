package com.webapps.training.business;

import com.webapps.training.beans.DataUser;

public interface DataUserDAOInterface {
	
	public int save(DataUser user);
	public DataUser find(String login);

}
