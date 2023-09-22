package com.bootORM.ORM.DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bootORM.ORM.contract.EmpDAO;
import com.bootORM.ORM.model.EmpModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class EmpDAOIMP implements EmpDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<EmpModel> findAll() {
		// TODO Auto-generated method stub

		return em.createQuery("SELECT la FROM EmpModel la").getResultList();

	}

}
