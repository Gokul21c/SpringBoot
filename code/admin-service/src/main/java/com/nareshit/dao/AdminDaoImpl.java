package com.nareshit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nareshit.domain.Admin;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Autowired
	private SessionFactory sf;
	
	
	@Override
	public Admin addAdmin(Admin admin) {
		Session ses = sf.openSession();
		
		Admin Admin =  new Admin();
		Admin.setFname("ram123");
		Admin.setLname("john");
		ses.save(Admin);
		
		ses.save(admin);
		ses.beginTransaction().commit();
		return admin;
	}

	@Override
	public Admin getAdminByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> searchAdmin(String name, String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
