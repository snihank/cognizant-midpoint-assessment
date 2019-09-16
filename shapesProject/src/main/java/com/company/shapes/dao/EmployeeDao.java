package com.company.shapes.dao;

import com.company.shapes.model.Employee;

public interface EmployeeDao {

    Employee getEmployee(int id);

    Employee createEmployee(Employee emp);
}
