package com.model;

import javax.websocket.Session;

public class BLManager {

	public static SessionFactory s= hibernateUtill.sessionFactory();

	public void savergisterinfo(Register reg)
	{
	Session s1 = s.openSession();

	Transaction t = s1.beginTransaction();

	s1.save(reg);

	t.commit();

	public Register searchbyemailpass(String email, String password)

	

	Sesssion s1= s.openSession();

	Criteria c=S1.CreateCriteria(Register.class);

	c.add (Restriction.eq("email", email));

	c. add(Restriction.eq("password", password));

	Register reg = (Register)c.uniqueResult();

	return reg;

	}

	public Admin searchForAdmin(String userName, String password) {

	Session S1= s.openSession():

		Criteria c=S1.CreateCriteria(Register.class);

	c.add(Restriction.eq("userName", userName));

	c. add(Restriction.eq("password", password));

	Admin a = (Admin)c.uniqueResult();

	return a;
	}
	public void saveProdInfo(Addproduct ap)

	Session s1 = s.openSession();

	Transaction t =s1.beginTransaction();

	s1.save(ap);

	t.commit();
	s1.close();
}

	public void delete(int rid)
	{
	Session s1= s.openSession; 

	Transaction t =s1.beginTransaction();
	Criteria c=S1.CreateCriteria(Register.class);

	c.add(Restriction.eq("rid", rid));

	Register reg = (Register)c.uniqueResult();
	
	s1.delete(reg);
	t.commit();
	s1.close();
	
	
	return reg;
	}

	public List<Register> showUserlist(){

	Session s1= s.openSession();

	Criteria c=s1.createCriteria(Register.class);

	List<Register> reglist= c.list();

	return reglist;
	}
	public List<AddProduct>showProduct(){

		Session s1= s.openSession();

		Criteria c=s1.createCriteria(AddProduct.class);

		List<AddProduct> prodlist= c.list();

		return prodlist;
		}
	
	
	
}
