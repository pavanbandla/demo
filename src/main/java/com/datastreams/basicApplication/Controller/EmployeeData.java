package com.datastreams.basicApplication.Controller;
import com.datastreams.basicApplication.Entity.Employee;
import com.datastreams.basicApplication.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("employee")
public class EmployeeData {
    @Autowired
    private ServiceInterface serviceInterface;


    @PostMapping
    public Employee saveEmployee( @RequestBody Employee employee){
        return serviceInterface.saveEmployee(employee);
    }
    @GetMapping()
    public List<Employee> fetchData(){
        return serviceInterface.fetchEmployee();

    }
}
