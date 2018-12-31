package com.nareshit.dao;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nareshit.domain.product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Iterator<product> getAllProducts() {
		//Session ses = sf.openSession();
		Session ses = sf.getCurrentSession();
		Query q = ses.createQuery("from product p");
		//ses.close();
		return q.list().iterator();
	}

	@Override
	public product addProduct(product p) {
		//Session ses = sf.openSession();
		Session ses = sf.getCurrentSession();
		ses.save(p);
		return p;
	}

	@Override
	public product getProductById(int id) {
		// TODO Auto-generated method stub
		//Session ses = sf.openSession();
		Session ses = sf.getCurrentSession();
		product p = ses.get(product.class, id);
		
		return p;
	}

	@Override
	public product getProductByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("name is:\t"+name);
		//Session ses = sf.openSession();
		Session ses = sf.getCurrentSession();
		Query q = ses.createQuery("from product p where p.name=:name");
		q.setParameter("name", name);
		
		return (product) q.list().get(0);
	}

}
