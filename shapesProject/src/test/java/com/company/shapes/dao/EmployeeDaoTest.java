package com.company.shapes.dao;

import com.company.shapes.model.Employee;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EmployeeDaoTest {

    @Autowired
    EmployeeDao empDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addGetEmployee() {

        Employee emp = new Employee();
        emp.setName("Shakib");

        emp = empDao.createEmployee(emp);

        Employee e1 = empDao.getEmployee(emp.getId());
        assertEquals(e1, emp);

    }


}