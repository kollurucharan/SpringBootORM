package com.bootORM.ORM.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bootORM.ORM.contract.EmpDAO;
import com.bootORM.ORM.contract.EmployeeRepository;
import com.bootORM.ORM.model.EmpModel;

@Repository
public class IEmpRepository implements EmployeeRepository {

	@Autowired
	private EmpDAO empdao;

	@Override
	public List<EmpModel> findAll() {
		return empdao.findAll();
	}

}
