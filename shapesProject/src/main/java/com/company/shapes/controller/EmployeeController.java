package com.company.shapes.controller;

import com.company.shapes.dao.EmployeeDao;
import com.company.shapes.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeDao empDao;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody @Valid Employee emp){
        return empDao.createEmployee(emp);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable("id") int id) {
        Employee employee = empDao.getEmployee(id);
        if (employee == null)
            System.out.println("Cannot find" + id);
        return employee;
    }

}
