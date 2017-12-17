package com.webapps.training.business;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.webapps.training.beans.DataUser;


public class DataUserDAOImpl extends HibernateDaoSupport implements
		DataUserDAOInterface {

	public int save(DataUser user) {
		Serializable serializable = getHibernateTemplate().save(user);
		return ((Long) serializable).intValue();
	}

	public DataUser find(String login) {
		SessionFactory sessionFactory = getHibernateTemplate().getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createSQLQuery("select * from data_user where login like '%"+login+"%'");
		List<Object[]> list = query.list();
		Object[] obj = list.get(0);
		DataUser dUser = new DataUser();
		dUser.setId(((BigInteger) obj[0]).longValue());
		dUser.setLogin((String) obj[1]);
		dUser.setPassword((String) obj[2]);
		return dUser;
	}

}
