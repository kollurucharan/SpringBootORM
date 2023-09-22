package com.bootORM.ORM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.bootORM.ORM.contract.EmployeeRepository;
import com.bootORM.ORM.model.EmpModel;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private EmployeeRepository empr;

	@GetMapping("/getAll")
	public String listEmployees(Model model) {
		List<EmpModel> employees = empr.findAll();
		model.addAttribute("employees", employees);
		return "index";
	}

}
