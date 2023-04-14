package com.datastreams.basicApplication.Service;

import com.datastreams.basicApplication.Entity.Employee;

import java.util.List;

public interface ServiceInterface {

    Employee saveEmployee(Employee employee);

    List<Employee> fetchEmployee();
}
