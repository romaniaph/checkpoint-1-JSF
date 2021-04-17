package br.com.fiap.rm85439.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.rm85439.model.User;
import br.com.fiap.rm85439.util.EntityManagerFacade;

public class UserDAO {
	private EntityManager manager = EntityManagerFacade.get();

	public void save(User user) {
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		
		manager.close();
		
	}

	public List<User> getAll() {
		String jpql = "SELECT s from User s";
		TypedQuery<User> createQuery = manager.createQuery(jpql, User.class);
		return createQuery.getResultList();
	}
}
