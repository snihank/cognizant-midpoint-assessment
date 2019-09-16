package com.company.shapes.mockTest;

import com.company.shapes.dao.EmployeeDao;
import com.company.shapes.dao.EmployeeDaoJdbcTemplateImpl;
import com.company.shapes.model.Employee;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class EmployeeMockTest {

    EmployeeDao employeeDao;

    @Before
    public void setUp() throws Exception{

        setUpEmployeeDaoDaoMock();


//        service = new ServiceLayer(employeeDao);
    }

    private void setUpEmployeeDaoDaoMock() {
        employeeDao = mock(EmployeeDaoJdbcTemplateImpl.class);
        Employee emp = new Employee();
        emp.setId(1);
        emp.setName("Shakib");


        Employee emp2 = new Employee();

        emp2.setName("Shakib");

        List<Employee> eList = new ArrayList<>();
        eList.add(emp);

        doReturn(emp).when(employeeDao).createEmployee(emp2);
        doReturn(emp).when(employeeDao).getEmployee(1);

    }

}
