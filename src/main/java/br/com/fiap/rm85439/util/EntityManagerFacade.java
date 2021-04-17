package br.com.fiap.rm85439.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFacade {
	
	public static EntityManager get() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
		return factory.createEntityManager();
	}
		
}
