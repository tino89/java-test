package com.system.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.system.entity.UserBean;

@Repository
@Transactional
public class UserImpl implements UserInterface {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public UserBean findById(Long id) {
		UserBean tmp = entityManager.find(UserBean.class, id);
		return tmp;
	}

	@Override
	public UserBean save(UserBean customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public List findAll() {
		List a = entityManager.createQuery("select c from UserBean c").getResultList();
		return a;
	}

	@Override
	public UserBean update(UserBean user) {
		entityManager.merge(user);
		return null;
	}

	

}
