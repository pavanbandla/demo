package com.datastreams.basicApplication.Service;

import com.datastreams.basicApplication.Entity.Employee;
import com.datastreams.basicApplication.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements ServiceInterface{
    @Autowired
    private EmployeeRepository e;
     public Employee saveEmployee(Employee employee){
         return e.save(employee);
     }
    @Override
    public List<Employee> fetchEmployee() {
        return  e.findAll();
    }
}
