package com.company.shapes.dao;

import com.company.shapes.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class EmployeeDaoJdbcTemplateImpl implements EmployeeDao{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public EmployeeDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    private static final String INSERT_EMPLOYEE_SQL =
            "insert into employee (name) values (?)";

    private static final String SELECT_EMPLOYEE_SQL =
            "select * from employee where id = ?";


    private Employee mapRowToConsole(ResultSet rs, int rowNum) throws SQLException {
        Employee emp = new Employee();
        emp.setId(rs.getInt("id"));
        emp.setName(rs.getString("name"));


        return emp;
    }

    @Override
    public Employee createEmployee(Employee emp) {
        jdbcTemplate.update(
                INSERT_EMPLOYEE_SQL,
                emp.getName()

        );

        int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        emp.setId(id);

        return emp;
    }


    @Override
    public Employee getEmployee(int id) {
        try {
            return jdbcTemplate.queryForObject(SELECT_EMPLOYEE_SQL, this::mapRowToConsole, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }


}
