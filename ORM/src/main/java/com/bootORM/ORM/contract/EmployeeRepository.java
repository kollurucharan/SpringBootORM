package com.bootORM.ORM.contract;

import java.util.List;

import com.bootORM.ORM.model.EmpModel;

public interface EmployeeRepository {

	List<EmpModel> findAll();

}
